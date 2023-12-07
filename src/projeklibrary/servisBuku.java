/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeklibrary;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import static projeklibrary.Peminjaman_.status;


/**
 *
 * @author LUI
 */
public class servisBuku {

    private static List<Peminjaman> getBystatus(String status) {
        String sql = "SELECT p FROM Peminjaman p WHERE LOWER(p.status) = :status ORDER BY p.peminjamanPK.idPeminjam";
        EntityManager em = Persistence.createEntityManagerFactory("ProjekLibraryPU").createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery(sql);
        query.setParameter("status", status.toLowerCase());
        List<Peminjaman> list = query.getResultList();
        em.getTransaction().commit();
        em.close();
        return list;
    }

    static void ubahData(Peminjaman mod) {
         EntityManager em = Persistence.createEntityManagerFactory("ProjekLibraryPU").createEntityManager();
        em.getTransaction().begin();
        em.merge(mod);
        em.getTransaction().commit();
        em.close();
    }

    static List<Peminjaman> ambillData() {
        EntityManager em = Persistence.createEntityManagerFactory("ProjekLibraryPU").createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT p FROM Peminjaman p ORDER BY p.peminjamanPK.idPeminjam");
        List<Peminjaman> list = query.getResultList();
        em.getTransaction().commit();
        em.close();
        return list;
    }

   
     servisPeminjaman servis = new servisPeminjaman();


    static void hapusData(String id) {
        String sql = "DELETE FROM DETAIL_SKRIPSI WHERE NO_PEMINJAMAN = ?;\n"
                + "DELETE FROM DETAIL_BUKU WHERE NO_PEMINJAMAN = ?;\n"
                + "DELETE FROM PEMINJAMAN WHERE NO_PEMINJAMAN = ?;";
        EntityManager em = Persistence.createEntityManagerFactory("ProjekLibraryPU").createEntityManager();
        em.getTransaction().begin();
        Query query = em.createNativeQuery(sql);
        query.setParameter(1, id);
        query.setParameter(2, id);
        query.setParameter(3, id);
        query.executeUpdate();
        em.getTransaction().commit();
        em.close();
    }
    
    static void ubahData(Buku_1 mod) {
        String sql = "DELETE FROM PENGARANG WHERE ID_BUKU = ?; DELETE FROM KATEGORI_BUKU WHERE ID_BUKU = ?;";
        EntityManager em = Persistence.createEntityManagerFactory("ProjekLibraryPU").createEntityManager();
        em.getTransaction().begin();
        Buku_1 p = em.find(Buku_1.class, mod.getIdBuku());
      
        Query query = em.createNativeQuery(sql);
        query.setParameter(1, mod.getIdBuku());
        query.setParameter(2, mod.getIdBuku());
        query.executeUpdate();
        em.merge(mod);
        em.getTransaction().commit();
        em.close();

        if (!mod.getKategori().isEmpty()) {
            tambahKategori(mod);
        }
        if (!mod.getPengarang().isEmpty()) {
            tambahPengarang(mod);
        }
    }

    public Buku_1 getById(String id) {
        EntityManager em = Persistence.createEntityManagerFactory("ProjekLibraryPU").createEntityManager();
        em.getTransaction().begin();
        Buku_1 p = em.find(Buku_1.class, id);
        if (p != null) {
            p.setKategori(ambilKategori(id));
            p.setPengarang(ambilPengarang(id));
        }
        em.getTransaction().commit();
        em.close();
        return p;
    }

    public Buku_1 getByIsbn(String isbn) {
        String jpql = "SELECT b FROM Buku b WHERE b.isbn = :isbn";
        EntityManager em = Persistence.createEntityManagerFactory("ProjekLibraryPU").createEntityManager();
        em.getTransaction().begin();
        TypedQuery<Buku_1> query = em.createQuery(jpql, Buku_1.class);
        query.setParameter("isbn", isbn);
        query.setMaxResults(1);
        Buku_1 p = null;
        try {
            p = query.getSingleResult();
            p.setKategori(ambilKategori(p.getIdBuku()));
            p.setPengarang(ambilPengarang(p.getIdBuku()));
        } catch (NoResultException e) {
            p = null;
        }
        em.getTransaction().commit();
        em.close();
        return p;
    }

    public List<Buku_1> getByID(String id) {
        EntityManager em = Persistence.createEntityManagerFactory("ProjekLibraryPU").createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT b FROM Buku b WHERE LOWER(b.idBuku) LIKE :idBuku ORDER BY b.idBuku");
        query.setParameter("idBuku", "%" + id.toLowerCase() + "%");
        List<Buku_1> list = query.getResultList();
        em.getTransaction().commit();
        em.close();
        for (int i = 0; i < list.size(); i++) {
            Buku_1 b = list.get(i);
            b.setKategori(ambilKategori(b.getIdBuku()));
            b.setPengarang(ambilPengarang(b.getIdBuku()));
            list.set(i, b);
        }
        return list;
    }

    public List<Buku_1> getByISBN(String isbn) {
        EntityManager em = Persistence.createEntityManagerFactory("ProjekLibraryPU").createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT b FROM Buku b WHERE LOWER(b.isbn) LIKE :isbn ORDER BY b.idBuku");
        query.setParameter("isbn", "%" + isbn.toLowerCase() + "%");
        List<Buku_1> list = query.getResultList();
        em.getTransaction().commit();
        em.close();
        for (int i = 0; i < list.size(); i++) {
            Buku_1 b = list.get(i);
            b.setKategori(ambilKategori(b.getIdBuku()));
            b.setPengarang(ambilPengarang(b.getIdBuku()));
            list.set(i, b);
        }
        return list;
    }

    public List<Buku_1> getByJudul(String judul) {
        EntityManager em = Persistence.createEntityManagerFactory("ProjekLibraryPU").createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT b FROM Buku b WHERE LOWER(b.judul) LIKE :judul ORDER BY b.idBuku");
        query.setParameter("judul", "%" + judul.toLowerCase() + "%");
        List<Buku_1> list = query.getResultList();
        em.getTransaction().commit();
        em.close();
        for (int i = 0; i < list.size(); i++) {
            Buku_1 b = list.get(i);
            b.setKategori(ambilKategori(b.getIdBuku()));
            b.setPengarang(ambilPengarang(b.getIdBuku()));
            list.set(i, b);
        }
        return list;
    }

    public List<Buku_1> getByPengarang(String pengarang) {
        String sql = "SELECT b.* FROM Buku b WHERE b.id_buku IN "
                + "(SELECT p.ID_BUKU FROM PENGARANG p WHERE LOWER(p.NAMA_PENGARANG) LIKE ?) "
                + "ORDER BY b.id_buku";
        EntityManager em = Persistence.createEntityManagerFactory("ProjekLibraryPU").createEntityManager();
        em.getTransaction().begin();
        Query query = em.createNativeQuery(sql, Buku_1.class);
        query.setParameter(1, "%" + pengarang.toLowerCase() + "%");
        List<Buku_1> list = query.getResultList();
        em.getTransaction().commit();
        em.close();
        for (int i = 0; i < list.size(); i++) {
            Buku_1 b = list.get(i);
            b.setKategori(ambilKategori(b.getIdBuku()));
            b.setPengarang(ambilPengarang(b.getIdBuku()));
            list.set(i, b);
        }
        return list;
    }

    public List<Buku_1> getByKategori(String kategori) {
        String sql = "SELECT b.* FROM Buku b WHERE b.id_buku IN "
                + "(SELECT kb.ID_BUKU FROM KATEGORI_BUKU kb WHERE LOWER(kb.KATEGORI) LIKE ?) "
                + "ORDER BY b.id_buku";
        EntityManager em = Persistence.createEntityManagerFactory("ProjekLibraryPU").createEntityManager();
        em.getTransaction().begin();
        Query query = em.createNativeQuery(sql, Buku_1.class);
        query.setParameter(1, "%" + kategori.toLowerCase() + "%");
        List<Buku_1> list = query.getResultList();
        em.getTransaction().commit();
        em.close();
        for (int i = 0; i < list.size(); i++) {
            Buku_1 b = list.get(i);
            b.setKategori(ambilKategori(b.getIdBuku()));
            b.setPengarang(ambilPengarang(b.getIdBuku()));
            list.set(i, b);
        }
        return list;
    }

    static List<Petugas> ambilData() {
        EntityManager em = Persistence.createEntityManagerFactory("ProjekLibraryPU").createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT p FROM Peminjaman p ORDER BY p.peminjamanPK.idPeminjam");
        List<Peminjaman> list = query.getResultList();
        em.getTransaction().commit();
        em.close();
        return null;
    }

    public void tambahData(Buku_1 mod) {
        EntityManager em = Persistence.createEntityManagerFactory("ProjekLibraryPU").createEntityManager();
        em.getTransaction().begin();
        em.persist(mod);
        em.getTransaction().commit();
        em.close();

        if (!mod.getKategori().isEmpty()) {
            tambahKategori(mod);
        }
        if (!mod.getPengarang().isEmpty()) {
            tambahPengarang(mod);
        }
    }

    static void tambahKategori(Buku_1 mod) {
        String sql = "INSERT INTO KATEGORI_BUKU (ID_BUKU, KATEGORI) VALUES (?,?)";
        EntityManager em = Persistence.createEntityManagerFactory("ProjekLibraryPU").createEntityManager();
        em.getTransaction().begin();
        for (String kategori : mod.getKategori()) {
            Query query = em.createNativeQuery(sql);
            query.setParameter(1, mod.getIdBuku());
            query.setParameter(2, kategori);
            query.executeUpdate();
        }
        em.getTransaction().commit();
        em.close();
    }

    static void tambahPengarang(Buku_1 mod) {
        String sql = "INSERT INTO PENGARANG (ID_BUKU, NAMA_PENGARANG) VALUES (?,?)";
        EntityManager em = Persistence.createEntityManagerFactory("ProjekLibraryPU").createEntityManager();
        em.getTransaction().begin();
        for (String pengarang : mod.getPengarang()) {
            Query query = em.createNativeQuery(sql);
            query.setParameter(1, mod.getIdBuku());
            query.setParameter(2, pengarang);
            query.executeUpdate();
        }
        em.getTransaction().commit();
        em.close();
    }

    private List<String> ambilKategori(String id) {
        String sql = "SELECT KATEGORI FROM KATEGORI_BUKU WHERE ID_BUKU = ?";
        EntityManager em = Persistence.createEntityManagerFactory("ProjekLibraryPU").createEntityManager();
        em.getTransaction().begin();
        Query query = em.createNativeQuery(sql);
        query.setParameter(1, id);
        List<String> list = query.getResultList();
        em.getTransaction().commit();
        em.close();
        return list;
    }

    private List<String> ambilPengarang(String id) {
        String sql = "SELECT NAMA_PENGARANG FROM PENGARANG WHERE ID_BUKU = ?";
        EntityManager em = Persistence.createEntityManagerFactory("ProjekLibraryPU").createEntityManager();
        em.getTransaction().begin();
        Query query = em.createNativeQuery(sql);
        query.setParameter(1, id);
        List<String> list = query.getResultList();
        em.getTransaction().commit();
        em.close();
        return list;
    }
    
    public int jumlahBuku() {
        EntityManager em = Persistence.createEntityManagerFactory("ProjekLibraryPU").createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT b FROM Buku b ORDER BY b.idBuku");
        List<Buku> list = query.getResultList();
        em.getTransaction().commit();
        em.close();
        return list.size();
    }

    public String nomer() {
        EntityManager em = Persistence.createEntityManagerFactory("ProjekLibraryPU").createEntityManager();
        String jpql = "SELECT SUBSTRING(b.idBuku, LENGTH(b.idBuku) - 2) AS nomor "
                + "FROM Buku b WHERE b.idBuku LIKE 'BK%' ORDER BY b.idBuku DESC";
        TypedQuery<String> query = em.createQuery(jpql, String.class);
        query.setMaxResults(1);
        Date now = new Date();
        SimpleDateFormat tanggal = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat nonformat = new SimpleDateFormat("yyMMdd");
        tanggal.format(now);
        String no = nonformat.format(now);
        String urutan = "";
        try {
            urutan = "BK" + no + String.format("%03d", Integer.parseInt(query.getSingleResult()) + 1);
        } catch (NoResultException e) {
            urutan = "BK" + no + "001";
        }
        em.close();
        return urutan;
    }

    public int jmlDipinjam(String id) {
        List<Peminjaman> p = servisBuku.getBystatus("Dipinjam");
        int i = 0;
        for(Peminjaman pem : p){
            List<DetailBuku> db = new ArrayList(pem.getDetailBukuCollection());
            for(DetailBuku b : db){
                if(b.getBuku().getIdBuku().equalsIgnoreCase(id)){
                    i += b.getJumlah();
                }
            }
        }
        return i;
    }
    
    

}
