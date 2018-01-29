<?php
include ('koneksi.php');
$np = $_GET['np'];
$sql = 'delete from mahasiswa where nim="'.$np.'"';
$query = mysqli_query($conn,$sql);
header('location: beranda.php');
 ?>
