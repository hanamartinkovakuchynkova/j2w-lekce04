[#ftl]
<!DOCTYPE html>
<html lang="cs">
<head>
    [#include '/_common/head.ftlh']
</head>
<body>

<div class="container">
    [#include '/_common/header.ftlh']

    <table class="table table-striped">
        <thead>
        <tr>
            <th scope="col">#</th>
            <th scope="col"></th>
            <th scope="col">Jméno</th>
            <th scope="col">Příjmení</th>
            <th scope="col">Bydliště</th>
            <th scope="col"></th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>1</td>
            <td><i class="las la-mars" style="color: blue;"></i></td>
            <td>Medvídek</td>
            <td>Pú</td>
            <td>Stokorcový les</td>
            <td><a href="/ucastnici/1" class="btn btn-primary">Detail</a></td>
        </tr>
        <tr>
            <td>2</td>
            <td><i class="las la-venus" style="color: red;"></i></td>
            <td>Čarodějnice</td>
            <td>Malá</td>
            <td><em>neuvedeno</em></td>
            <td><a href="/ucastnici/2" class="btn btn-primary">Detail</a></td>
        </tr>
        </tbody>
    </table>
</div>
</body>
</html>
