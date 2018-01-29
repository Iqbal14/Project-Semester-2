<?php
session_start();
if(!isset($_SESSION['nama'])){

  echo "<h4><center>login'no Cok <a href='masuk.php'>Nang Kene</a></h4>";
} else {



 ?>

<!DOCTYPE html>
<html>
  <head>

    <title>Beranda</title>
    <link rel="stylesheet" type="text/css" href="style.css">
  </head>
  <body><center>
    <h1>maseko</h1>
    <header>
      <ul>
        <a href="index.php"><li>beranda</li></a>
        <a href="profil.php"><li>profil</li></a>
        <a href="keluar.php"><li>keluar</li></a>
      </ul>
    </header>
    <section><center>
      <font style="font-size : 40px;">Selamat Datang <?php echo $_SESSION['nama'] ?>
         di Profil</font>
    </section>
    <footer>Copyight & copy:2017 Maseko. Allright Reserved.</footer>

  </body>
</html>

<?php } ?>
