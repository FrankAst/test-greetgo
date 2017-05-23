<!doctype html>
<html>
<title>Hello World</title>
<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous"/>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script type="text/javascript" src="http://beneposto.pl/jqueryrotate/js/jQueryRotateCompressed.js"></script>
</head>

<style type="text/css">
#logo{
height: 40px;
width: 69px; 
float: right;
margin: 15px 50px 15px 15px;
}
.container{
padding-top: 50px;
}
</style>

<script type="text/javascript" >
$(document).ready(function () {

setInterval(function (){
   $("#image").rotate({
      angle:0, 
      animateTo:360, 
      duration: 2000,
   });
},2000);
});
</script>

<body>
<div class="container">
    <div class="row text-center">
        <h1 id="message">Hello, greetgo!</h1>
    </div>
    <div class="row text-center">
        <h3 id="message"></h3>
    </div>

    <div class="row">
        <div id="logo" class="col-md-5">
            <img src="h.jpeg" id="image" />
        </div>
    </div>
</div>
</body>

</html>