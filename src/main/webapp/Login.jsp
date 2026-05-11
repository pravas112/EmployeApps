<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<title>Professional Login</title>

<style>

*{
    margin:0;
    padding:0;
    box-sizing:border-box;
    font-family:Arial, sans-serif;
}

body{
    height:100vh;
    display:flex;
    justify-content:center;
    align-items:center;
    background:linear-gradient(135deg,#141e30,#243b55);
}

.login-container{
    width:350px;
    background:white;
    padding:35px;
    border-radius:12px;
    box-shadow:0px 5px 20px rgba(0,0,0,0.3);
}

.login-container h2{
    text-align:center;
    margin-bottom:25px;
    color:#333;
}

.input-box{
    width:100%;
    padding:12px;
    margin-bottom:18px;
    border:1px solid #ccc;
    border-radius:6px;
    font-size:15px;
    outline:none;
}

.input-box:focus{
    border-color:#243b55;
}

.btn-login{
    width:100%;
    padding:12px;
    background:#243b55;
    color:white;
    border:none;
    border-radius:6px;
    font-size:16px;
    cursor:pointer;
    transition:0.3s;
}

.btn-login:hover{
    background:#141e30;
}

.extra-links{
    margin-top:18px;
    text-align:center;
    font-size:14px;
}

.extra-links a{
    text-decoration:none;
    color:#243b55;
    font-weight:bold;
}

.extra-links a:hover{
    color:#141e30;
}

</style>

</head>

<body>

<div class="login-container">
<h4 style='color:red'>${msg}</h4>
    <h2>Login</h2>

    <form action="login" method="post">

        <input type="email"
               placeholder="Enter Email"
               name="email"
               class="input-box"
               required>

        <input type="password"
               placeholder="Enter Password"
               name="password"
               class="input-box"
               required>

        <input type="submit"
               value="Login"
               class="btn-login">

    </form>

    <div class="extra-links">

        <p>
            Don't have an account ?<a href="employee.html">Sign Up</a></p>

    </div>

</div>

</body>
</html>