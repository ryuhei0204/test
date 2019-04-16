<!DOCTYPE html>
<html lang="ja">
    
    <head>
        <meta charset="UTF-8">
        <title>4eachblog 掲示板</title>
        <link rel="stylesheet" type="text/css" href="style.css">
    </head>
    
    <body>
    <?php
    mb_internal_encoding("UTF-8");
    $pdo=new PDO("mysql:dbname=nishihara3;host=localhost;","root","mysql");
    $stmt=$pdo->query("select*from 4each_keijiban");
    ?>
<header>
   <img src="4eachblog_logo.jpg">
    <ul class="menu">s
        <li>トップ</li>
        <li>プロフィール</li>
        <li>4eachについて</li>
        <li>登録フォーム</li>
        <li>お問い合わせ</li>
        <li>その他</li>
    </ul>
</header>
<main>
   <div class="main-container">
       <div class="left">
       <h1>プログラミングに役立つ掲示板</h1>
       <form method="post" action="insert.php">
          <h3>入力フォーム</h3>
           <div>
               <label>ハンドルネーム</label>
               <br>
               <input type="text"class="text"size="35"name="handlename"></div>
           <div>
               <label>タイトル</label>
               <br>
               <input type="text"class="text"size="35"name="title">
           </div>
           <div>
               <label>コメント</label>
               <br>
               <textarea rows="7"cols="35"name="comments"></textarea>
           </div>
           <div>
               <input type="submit"class="submit"value="投稿する">
           </div>
           </form>
           <?Php
           while($row =$stmt->fetch()){
           echo "<div class='user1'>";
           echo "<h2>".$row['title']."</h2>";
           echo $row['comments'];
           echo "<br>";
           echo "<h5>posted by".$row['handlename']."</h5>";
           echo "</div>";
           }
           ?>
           
           
           </div>
        
       <div class="right">
       <ul class="rightmenu">
       <h2>人気の記事</h2>
           <li>PHPオススメ本</li>
           <li>PHP　MyAdminの使い方</li>
           <li>今人気のエディタTop5</li>
           <li>HTMLの基礎</li>
       
       <h2>オススメリンク</h2>
       
           <li>インターノウス株式会社</li>
           <li>XAMPPのダウンロード</li>
           <li>Eclipseのダウンロード</li>
           <li>Braketsのダウンロード</li>
       
       <h2>カテゴリ</h2>
       
           <li>HTML</li>
           <li>PHP</li>
           <li>MySQL</li>
           <li>JavaScript</li>
       </ul>
   </div>
   </div>
    </main>
    <footer>
        copyright internous|4sach blog is the one which provides A to Z about programming.
    </footer>
    </body>
</html>