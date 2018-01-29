<!DOCTYPE html>
<html>
  <head>

    <title>Beranda</title>
    <link rel="stylesheet" type="text/css" href="style.css">
  </head>
  <body><center>
    <h1>maseko</h1>

    <section><center>
    <div class ="box-login"></div>
    <form action="" method="post">
      <input type="text" name="email" placeholder="Masukkan Emailmu"></input></br>
      <input type="password" name="password" placeholder="Masukkan Passwordmu"></input></br>
      <input type="submit" name="masuk" value="Masuk"/><br>
    </form>

    <?php

      include"koneksi.php";
      if (isset($_POST['masuk'])){
        $cek = mysqli_query($conn, "SELECT * FROM user WHERE
        email='".$_POST['email']."' AND password ='".$_POST['password']."'");
        $hasil = mysqli_fetch_array($cek);
        $count = mysqli_num_rows($cek);
        $nama_user = $hasil['nama'];
        if ($count > 0){
          session_start();
          $_SESSION['nama']= $nama_user;
          header("location:index.php");
        } else {
          echo "Gagal";
        }

      }
     ?>

    </section>


  </body>
</html>
