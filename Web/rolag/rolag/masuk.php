<!DOCTYPE html>
<html lang="en">

<head>
	<meta charset="utf-8">
	<title>Rolag - Sign In</title>

	<!-- Google Fonts -->
	<link href='https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700|Lato:400,100,300,700,900' rel='stylesheet' type='text/css'>

	<link rel="stylesheet" href="web/css/animate.css">
	<!-- Custom Stylesheet -->
	<link rel="stylesheet" href="web/css/style.css">

	<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.4/jquery.min.js"></script>
</head>

<body>
	<div class="container">
		<div class="top">
			<h1 id="title" class="hidden"><span id="logo">Login <span>Rolag</span></span></h1>
		</div>
		<div class="login-box animated fadeInUp">
			<div class="box-header">
				<h2>Log In</h2>
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

<script>
	$(document).ready(function () {
    	$('#logo').addClass('animated fadeInDown');
    	$("input:text:visible:first").focus();
	});
	$('#username').focus(function() {
		$('label[for="username"]').addClass('selected');
	});
	$('#username').blur(function() {
		$('label[for="username"]').removeClass('selected');
	});
	$('#password').focus(function() {
		$('label[for="password"]').addClass('selected');
	});
	$('#password').blur(function() {
		$('label[for="password"]').removeClass('selected');
	});
</script>

</html>
