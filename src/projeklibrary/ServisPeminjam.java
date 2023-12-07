/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeklibrary;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

/**
 *
 * @author LUI
 */
public class ServisPeminjam {
    
    public void tambahData(Peminjam mod) {
        EntityManager em = Persistence.createEntityManagerFactory("ProjekLibraryPU").createEntityManager();
        em.getTransaction().begin();
        em.persist(mod);
        em.getTransaction().commit();
        em.close();
    }

    public void ubahData(Peminjam mod) {
        EntityManager em = Persistence.createEntityManagerFactory("ProjekLibraryPU").createEntityManager();
        em.getTransaction().begin();
        Peminjam p = em.find(Peminjam.class, mod.getIdPeminjam());
        em.merge(mod);
        em.getTransaction().commit();
        em.close();
    }

    public void hapusData(String id) {
        EntityManager em = Persistence.createEntityManagerFactory("ProjekLibraryPU").createEntityManager();
        em.getTransaction().begin();
        Peminjam p = em.find(Peminjam.class, id);
        em.remove(p);
        em.getTransaction().commit();
        em.close();
    }

    public List<Peminjam> ambilData() {
        EntityManager em = Persistence.createEntityManagerFactory("ProjekLibraryPU").createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT p FROM Peminjam p ORDER BY p.idPeminjam");
        List<Peminjam> list = query.getResultList();
        em.getTransaction().commit();
        em.close();
        return list;
    }

    public List<Peminjam> getByID(String id) {
        EntityManager em = Persistence.createEntityManagerFactory("ProjekLibraryPU").createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT p FROM Peminjam p WHERE LOWER(p.idPeminjam) LIKE :idPeminjam ORDER BY p.idPeminjam");
        query.setParameter("idPeminjam", "%" + id.toLowerCase() + "%");
        List<Peminjam> list = query.getResultList();
        em.getTransaction().commit();
        em.close();
        return list;
    }

    public List<Peminjam> getByNama(String nama) {
        EntityManager em = Persistence.createEntityManagerFactory("ProjekLibraryPU").createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT p FROM Peminjam p WHERE LOWER(p.nama) LIKE :nama ORDER BY p.idPeminjam");
        query.setParameter("nama", "%" + nama.toLowerCase() + "%");
        List<Peminjam> list = query.getResultList();
        em.getTransaction().commit();
        em.close();
        return list;
    }

    public List<Peminjam> getByNim(String nim) {
        EntityManager em = Persistence.createEntityManagerFactory("ProjekLibraryPU").createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT p FROM Peminjam p WHERE LOWER(p.nim) LIKE :nim ORDER BY p.idPeminjam");
        query.setParameter("nim", "%" + nim.toLowerCase() + "%");
        List<Peminjam> list = query.getResultList();
        em.getTransaction().commit();
        em.close();
        return list;
    }

    public List<Peminjam> getByFakultas(String fakultas) {
        EntityManager em = Persistence.createEntityManagerFactory("ProjekLibraryPU").createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT p FROM Peminjam p WHERE LOWER(p.fakultas) LIKE :fakultas ORDER BY p.idPeminjam");
        query.setParameter("fakultas", "%" + fakultas.toLowerCase() + "%");
        List<Peminjam> list = query.getResultList();
        em.getTransaction().commit();
        em.close();
        return list;
    }

    public List<Peminjam> getByProdi(String prodi) {
        EntityManager em = Persistence.createEntityManagerFactory("ProjekLibraryPU").createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT p FROM Peminjam p WHERE LOWER(p.programStudi) LIKE :prodi ORDER BY p.idPeminjam");
        query.setParameter("prodi", "%" + prodi.toLowerCase() + "%");
        List<Peminjam> list = query.getResultList();
        em.getTransaction().commit();
        em.close();
        return list;
    }

    public List<Peminjam> getByAlamat(String alamat) {
        EntityManager em = Persistence.createEntityManagerFactory("ProjekLibraryPU").createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT p FROM Peminjam p WHERE LOWER(p.alamat) LIKE :alamat ORDER BY p.idPeminjam");
        query.setParameter("alamat", "%" + alamat.toLowerCase() + "%");
        List<Peminjam> list = query.getResultList();
        em.getTransaction().commit();
        em.close();
        return list;
    }

    public Peminjam getById(String id) {
        EntityManager em = Persistence.createEntityManagerFactory("ProjekLibraryPU").createEntityManager();
        em.getTransaction().begin();
        Peminjam p = em.find(Peminjam.class, id);
        em.getTransaction().commit();
        em.close();
        return p;
    }

    public String nomer() {
        EntityManager em = Persistence.createEntityManagerFactory("ProjekLibraryPU").createEntityManager();
        String jpql = "SELECT SUBSTRING(p.idPeminjam, LENGTH(p.idPeminjam) - 2) AS nomor "
                + "FROM Peminjam p WHERE p.idPeminjam LIKE 'PM%' ORDER BY p.idPeminjam DESC";
        TypedQuery<String> query = em.createQuery(jpql, String.class);
        query.setMaxResults(1);
        String urutan = "";
        em.close();
        return urutan;
    }

    public int jumlahAnggota() {
        EntityManager em = Persistence.createEntityManagerFactory("ProjekLibraryPU").createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT p FROM Peminjam p ORDER BY p.idPeminjam");
        List<Peminjam> list = query.getResultList();
        em.getTransaction().commit();
        em.close();
        return list.size();
    }
}
