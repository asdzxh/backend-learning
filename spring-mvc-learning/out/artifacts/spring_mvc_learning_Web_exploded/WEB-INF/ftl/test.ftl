<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">


    <style>
        .row {
            display: flex;
            flex-wrap: wrap;
        }
        .row div {
            justify-content: center;
            justify-items: center;
        }
    </style>
</head>
<body>



<div class="container marketing">

    <h1 style="margin: 30px">What Spring can do</h1>
    <div class="row" style=" ">
        <#list list as e>
            <div class="col-lg-2 "  style="border:1px solid #c1e2b3;margin: 10px;width: 500px" >
                <img src="${e.url}" style="width: 150px;height: 150px" >
                <h2 class="fw-normal">${e.name}</h2>
                <p>${e.content}</p>
            </div>
        </#list>
    </div><!-- /.row -->


</div>
</body>
</html>
