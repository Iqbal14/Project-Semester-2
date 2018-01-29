<?php
include ('koneksi.php');
if (isset($_POST['np'])){
  $np = $_GET ['np'];
  $query = mysqli_query($conn,'SELECT * FROM daftar_menu WHERE no ="'.$np.'"');
  $data = mysqli_fetch_array($query);
//  $nim = $data ['nim'];
  $nama = $data ['nama'];
  $harga = $data ['harga'];



}
else{
  $nama = '';
  $harga = '';

}
 ?>


 <!DOCTYPE html>
 <html>
   <head>

     <title>Update Data</title>
   </head>
   <body><center>
     <form method="post" name="edit" action="aksidata.php">
       <p>No : <input type="text" name="no" value="<?php echo $_GET['np']; ?>"></p>
       <p>Nama : <input type="text" name="nama" value="<?php echo $nama; ?>"></p>
       <p>harga : <input type="text" name="harga" value="<?php echo $harga; ?>"></p>

       <br><p><input type="submit" name="ubah" value="UPDATE"></p></br>


     </form>

   </body>
 </html>
