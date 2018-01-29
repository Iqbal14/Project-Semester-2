<?php
include('koneksi.php');
if (isset ($_POST['daftar']) ){
  $no= $_POST['no'];
  $nama = $_POST['nama'];
  $harga = $_POST['harga'];


  $sql = 'insert into daftar_menu (no,nama,harga) value ("'.$no.'","'.$nama.'","'.$harga.'")';
  $query = mysqli_query($conn,$sql);

  if ($query){
    header('location: index.php');
  } else {
    echo 'GAGAl';
  }

}

if (isset($_POST['ubah'])){
  $no = $_POST['no'];
  $nama = $_POST['nama'];
  $harga = $_POST['harga'];

  $sql = 'update daftar_menu set nama="'.$nama.'", harga="'.$harga.'" where nim="'.$no.'"';
  $query = mysqli_query($conn,$sql);

  if ($query){
    header('location: index.php');
  } else {
    echo'GAGAL';
  }
}




 ?>
