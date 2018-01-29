<?php
session_start();
if(!isset($_SESSION['nama'])){

  echo "<h4><center>login'no Mbak/Mas <a href='masuk.php'>Nang Kene</a></h4>";
} else {

 ?>



<!DOCTYPE html>
<html>
  <head>

    <title>Beranda</title>
    <link rel="stylesheet" type="text/css" href="style.css">
  </head>
  <body><center>
    <font style="font-size : 40px;">Selamat Datang <?php echo $_SESSION['nama'] ?>
      di Beranda </font>
    <header>
      <ul>
        <a href="index.php"><li>beranda</li></a>
        <a href="profil.php"><li>profil</li></a>
        <a href="keluar.php"><li>keluar</li></a>
      </ul>
    </header>
    <section><center>

        <h1><center>Menu Makanan Rolag</h1>
          <?php
            include ('koneksi.php');
           ?>
          <?php
         $sql = 'SELECT * FROM daftar_menu';
         $query = mysqli_query($conn,$sql);

           ?>
          <table>

            <p>Searching by no  :<br> <input type="text" nama="search" </p>
            <p><a href="search.php"><button>Search</button><a/></p>
              <br> <br>



           <table border="1" cellpadding="8" cellspacing="0" bordercolor="black">
             <tr>
               <td align="center" bgcolor="#00FF00"> NIM </td>
               <td align="center" bgcolor="#00FF00"> Nama </td>
               <td align="center" bgcolor="#00FF00"> Alamat </td>

               <td align="center"bgcolor="red"><a href="insert.php"><button>Insert</button><a/></td>
             </tr>

             <?php
             while ($data = mysqli_fetch_array($query)) {

             ?>


             <tr align="center">
              <td><?php echo $data['no']; ?> </td>
              <td><?php echo $data['nama']; ?> </td>
              <td><?php echo $data['harga']; ?> </td>

              <td bgcolor="red"><a href="update.php?np=<?php echo $data['no'];?>" title="Edit Menu ini ?"><button>Update</button></a>
                <a href="delete.php?np=<?php echo $data['no'];?>" title="Hapus Menu Ini ?"><button>Delete</button></a></td>
            </tr>

            <?php
          } ?>

        </table>
    </section>
    <footer>Copyight &copy 2017 Maseko. Allright Reserved.</footer>

  </body>
</html>
<?php } ?>
