/*==============================================================*/
/* Table: BUKU                                                  */
/*==============================================================*/
create table BUKU (
   ID_BUKU              CHAR(11)             not null,
   JUDUL                VARCHAR(50)          null,
   SUBJUDUL             VARCHAR(50)          null,
   ISBN                 CHAR(13)             null,
   BAHASA               VARCHAR(15)          null,
   PENERBIT             VARCHAR(50)          null,
   TAHUN_TERBIT         VARCHAR(4)           null,
   JUMLAH_HALAMAN       INT4                 null,
   JUMLAH_BUKU          INT4                 null,
   constraint PK_BUKU primary key (ID_BUKU)
);

/*==============================================================*/
/* Index: BUKU_PK                                               */
/*==============================================================*/
create unique index BUKU_PK on BUKU (
ID_BUKU
);

/*==============================================================*/
/* Table: DETAIL_BUKU                                           */
/*==============================================================*/
create table DETAIL_BUKU (
   ID_BUKU              CHAR(11)             not null,
   ID_PETUGAS           CHAR(5)              not null,
   ID_PEMINJAM          CHAR(5)              not null,
   NO_PEMINJAMAN        CHAR(10)             not null,
   JUMLAH               INT4                 null,
   constraint PK_DETAIL_BUKU primary key (ID_BUKU, ID_PETUGAS, ID_PEMINJAM, NO_PEMINJAMAN)
);

/*==============================================================*/
/* Index: DETAIL_BUKU_PK                                        */
/*==============================================================*/
create unique index DETAIL_BUKU_PK on DETAIL_BUKU (
ID_BUKU,
ID_PETUGAS,
ID_PEMINJAM,
NO_PEMINJAMAN
);

/*==============================================================*/
/* Index: MEMILIKI7_FK                                          */
/*==============================================================*/
create  index MEMILIKI7_FK on DETAIL_BUKU (
ID_PETUGAS,
ID_PEMINJAM,
NO_PEMINJAMAN
);

/*==============================================================*/
/* Index: MEMILIKI8_FK                                          */
/*==============================================================*/
create  index MEMILIKI8_FK on DETAIL_BUKU (
ID_BUKU
);

/*==============================================================*/
/* Table: DETAIL_SKRIPSI                                        */
/*==============================================================*/
create table DETAIL_SKRIPSI (
   ID_SKRIPSI           CHAR(11)             not null,
   ID_PETUGAS           CHAR(5)              not null,
   ID_PEMINJAM          CHAR(5)              not null,
   NO_PEMINJAMAN        CHAR(10)             not null,
   JUMLAH               INT4                 null,
   constraint PK_DETAIL_SKRIPSI primary key (ID_SKRIPSI, ID_PETUGAS, ID_PEMINJAM, NO_PEMINJAMAN)
);

/*==============================================================*/
/* Index: DETAIL_SKRIPSI_PK                                     */
/*==============================================================*/
create unique index DETAIL_SKRIPSI_PK on DETAIL_SKRIPSI (
ID_SKRIPSI,
ID_PETUGAS,
ID_PEMINJAM,
NO_PEMINJAMAN
);

/*==============================================================*/
/* Index: MEMILIKI5_FK                                          */
/*==============================================================*/
create  index MEMILIKI5_FK on DETAIL_SKRIPSI (
ID_PETUGAS,
ID_PEMINJAM,
NO_PEMINJAMAN
);

/*==============================================================*/
/* Index: MEMILIKI6_FK                                          */
/*==============================================================*/
create  index MEMILIKI6_FK on DETAIL_SKRIPSI (
ID_SKRIPSI
);

/*==============================================================*/
/* Table: KATEGORI                                              */
/*==============================================================*/
create table KATEGORI (
   ID_KATEGORI          CHAR(4)              not null,
   KATEGORI             VARCHAR(20)          null,
   constraint PK_KATEGORI primary key (ID_KATEGORI)
);

/*==============================================================*/
/* Index: KATEGORI_PK                                           */
/*==============================================================*/
create unique index KATEGORI_PK on KATEGORI (
ID_KATEGORI
);

/*==============================================================*/
/* Table: KATEGORI_BUKU                                         */
/*==============================================================*/
create table KATEGORI_BUKU (
   ID_BUKU              CHAR(11)             not null,
   ID_KATEGORI          CHAR(4)              not null,
   constraint PK_KATEGORI_BUKU primary key (ID_BUKU, ID_KATEGORI)
);

/*==============================================================*/
/* Index: KATEGORI_BUKU_PK                                      */
/*==============================================================*/
create unique index KATEGORI_BUKU_PK on KATEGORI_BUKU (
ID_BUKU,
ID_KATEGORI
);

/*==============================================================*/
/* Index: MEMILIKI21_FK                                         */
/*==============================================================*/
create  index MEMILIKI21_FK on KATEGORI_BUKU (
ID_KATEGORI
);

/*==============================================================*/
/* Index: MEMILIKI20_FK                                         */
/*==============================================================*/
create  index MEMILIKI20_FK on KATEGORI_BUKU (
ID_BUKU
);

/*==============================================================*/
/* Table: KATEGORI_SKRIPSI                                      */
/*==============================================================*/
create table KATEGORI_SKRIPSI (
   ID_SKRIPSI           CHAR(11)             not null,
   ID_KATEGORI          CHAR(4)              not null,
   constraint PK_KATEGORI_SKRIPSI primary key (ID_SKRIPSI, ID_KATEGORI)
);

/*==============================================================*/
/* Index: KATEGORI_SKRIPSI_PK                                   */
/*==============================================================*/
create unique index KATEGORI_SKRIPSI_PK on KATEGORI_SKRIPSI (
ID_SKRIPSI,
ID_KATEGORI
);

/*==============================================================*/
/* Index: MEMILIKI22_FK                                         */
/*==============================================================*/
create  index MEMILIKI22_FK on KATEGORI_SKRIPSI (
ID_KATEGORI
);

/*==============================================================*/
/* Index: MEMILIKI3_FK                                          */
/*==============================================================*/
create  index MEMILIKI3_FK on KATEGORI_SKRIPSI (
ID_SKRIPSI
);

/*==============================================================*/
/* Table: PEMINJAM                                              */
/*==============================================================*/
create table PEMINJAM (
   ID_PEMINJAM          CHAR(5)              not null,
   NAMA                 VARCHAR(30)          null,
   NIM                  VARCHAR(15)          null,
   FAKULTAS             VARCHAR(30)          null,
   PROGRAM_STUDI        VARCHAR(30)          null,
   ANGKATAN             CHAR(4)              null,
   ALAMAT               VARCHAR(100)         null,
   TELEPHONE            VARCHAR(13)          null,
   EMAIL                VARCHAR(30)          null,
   constraint PK_PEMINJAM primary key (ID_PEMINJAM)
);

/*==============================================================*/
/* Index: PEMINJAM_PK                                           */
/*==============================================================*/
create unique index PEMINJAM_PK on PEMINJAM (
ID_PEMINJAM
);

/*==============================================================*/
/* Table: PEMINJAMAN                                            */
/*==============================================================*/
create table PEMINJAMAN (
   ID_PETUGAS           CHAR(5)              not null,
   ID_PEMINJAM          CHAR(5)              not null,
   NO_PEMINJAMAN        CHAR(10)             not null,
   TANGGAL_PINJAM       DATE                 null,
   TANGGAL_KEMBALI      DATE                 null,
   KETERANGAN           VARCHAR(100)         null,
   STATUS               VARCHAR(8)           null,
   constraint PK_PEMINJAMAN primary key (ID_PETUGAS, ID_PEMINJAM, NO_PEMINJAMAN)
);

/*==============================================================*/
/* Index: PEMINJAMAN_PK                                         */
/*==============================================================*/
create unique index PEMINJAMAN_PK on PEMINJAMAN (
ID_PETUGAS,
ID_PEMINJAM,
NO_PEMINJAMAN
);

/*==============================================================*/
/* Index: MELAKUKAN11_FK                                        */
/*==============================================================*/
create  index MELAKUKAN11_FK on PEMINJAMAN (
ID_PETUGAS
);

/*==============================================================*/
/* Index: MELAKUKAN_FK                                          */
/*==============================================================*/
create  index MELAKUKAN_FK on PEMINJAMAN (
ID_PEMINJAM
);

/*==============================================================*/
/* Table: PENGARANG                                             */
/*==============================================================*/
create table PENGARANG (
   ID_BUKU              CHAR(11)             null,
   NAMA_PENGARANG       VARCHAR(30)          null
);

/*==============================================================*/
/* Index: MEMILIKI_FK                                           */
/*==============================================================*/
create  index MEMILIKI_FK on PENGARANG (
ID_BUKU
);

/*==============================================================*/
/* Table: PETUGAS                                               */
/*==============================================================*/
create table PETUGAS (
   ID_PETUGAS           CHAR(5)              not null,
   NAMA                 VARCHAR(30)          null,
   EMAIL                VARCHAR(30)          null,
   ALAMAT               VARCHAR(100)         null,
   JENIS_KELAMIN        CHAR(1)              null,
   TELEPHONE            VARCHAR(13)          null,
   USERNAME             VARCHAR(30)          null,
   PASSWORD             VARCHAR(100)         null,
   constraint PK_PETUGAS primary key (ID_PETUGAS)
);

/*==============================================================*/
/* Index: PETUGAS_PK                                            */
/*==============================================================*/
create unique index PETUGAS_PK on PETUGAS (
ID_PETUGAS
);

/*==============================================================*/
/* Table: SKRIPSI                                               */
/*==============================================================*/
create table SKRIPSI (
   ID_SKRIPSI           CHAR(11)             not null,
   JUDUL                VARCHAR(50)          null,
   BAHASA               VARCHAR(15)          null,
   FAKULTAS             VARCHAR(30)          null,
   PROGRAM_STUDI        VARCHAR(30)          null,
   TAHUN                VARCHAR(4)           null,
   PENULIS              VARCHAR(30)          null,
   PEMBIMBING           VARCHAR(30)          null,
   JUMLAH_HALAMAN       INT4                 null,
   JUMLAH_SALINAN       INT4                 null,
   constraint PK_SKRIPSI primary key (ID_SKRIPSI)
);

/*==============================================================*/
/* Index: SKRIPSI_PK                                            */
/*==============================================================*/
create unique index SKRIPSI_PK on SKRIPSI (
ID_SKRIPSI
);

alter table DETAIL_BUKU
   add constraint FK_DETAIL_B_MEMILIKI7_PEMINJAM foreign key (ID_PETUGAS, ID_PEMINJAM, NO_PEMINJAMAN)
      references PEMINJAMAN (ID_PETUGAS, ID_PEMINJAM, NO_PEMINJAMAN)
      on delete restrict on update restrict;

alter table DETAIL_BUKU
   add constraint FK_DETAIL_B_MEMILIKI8_BUKU foreign key (ID_BUKU)
      references BUKU (ID_BUKU)
      on delete restrict on update restrict;

alter table DETAIL_SKRIPSI
   add constraint FK_DETAIL_S_MEMILIKI5_PEMINJAM foreign key (ID_PETUGAS, ID_PEMINJAM, NO_PEMINJAMAN)
      references PEMINJAMAN (ID_PETUGAS, ID_PEMINJAM, NO_PEMINJAMAN)
      on delete restrict on update restrict;

alter table DETAIL_SKRIPSI
   add constraint FK_DETAIL_S_MEMILIKI6_SKRIPSI foreign key (ID_SKRIPSI)
      references SKRIPSI (ID_SKRIPSI)
      on delete restrict on update restrict;

alter table KATEGORI_BUKU
   add constraint FK_KATEGORI_MEMILIKI2_BUKU foreign key (ID_BUKU)
      references BUKU (ID_BUKU)
      on delete restrict on update restrict;

alter table KATEGORI_BUKU
   add constraint FK_KATEGORI_MEMILIKI2_KATEGORI foreign key (ID_KATEGORI)
      references KATEGORI (ID_KATEGORI)
      on delete restrict on update restrict;

alter table KATEGORI_SKRIPSI
   add constraint FK_KATEGORI_MEMILIKI2_KATEGORI foreign key (ID_KATEGORI)
      references KATEGORI (ID_KATEGORI)
      on delete restrict on update restrict;

alter table KATEGORI_SKRIPSI
   add constraint FK_KATEGORI_MEMILIKI2_SKRIPSI foreign key (ID_SKRIPSI)
      references SKRIPSI (ID_SKRIPSI)
      on delete restrict on update restrict;

alter table PEMINJAMAN
   add constraint FK_PEMINJAM_MELAKUKAN_PEMINJAM foreign key (ID_PEMINJAM)
      references PEMINJAM (ID_PEMINJAM)
      on delete restrict on update restrict;

alter table PEMINJAMAN
   add constraint FK_PEMINJAM_MELAKUKAN_PETUGAS foreign key (ID_PETUGAS)
      references PETUGAS (ID_PETUGAS)
      on delete restrict on update restrict;

alter table PENGARANG
   add constraint FK_PENGARAN_MEMILIKI_BUKU foreign key (ID_BUKU)
      references BUKU (ID_BUKU)
      on delete restrict on update restrict;