[#ftl]
<!DOCTYPE html>
<html lang="cs">
<head>
    [#include '/_common/head.ftlh']
</head>
<body>

<div class="container">
    [#include '/_common/header.ftlh']

    [#list seznamLekci]
        <table class="table">
            <thead>
            <tr>
                <th scope="col"></th>
                <th scope="col">Název lekce</th>
                <th scope="col">Datum</th>
                <th scope="col">Čas</th>
                <th scope="col">Místo</th>
                <th scope="col"></th>
            </tr>
            </thead>
            <tbody>
            [#items as lekce]
                <tr>
                    <td>${lekce?counter}.</td>
                    <td>${lekce.nazev}</td>
                    <td>${lekce.datum?date}</td>
                    <td>${lekce.casOd?time}–${lekce.casDo?time}</td>
                    <td>${lekce.misto}</td>
                    <td><a href="/lekce/detail/${lekce?index}" class="btn btn-primary">Detail</a></td>
                </tr>
            [/#items]
            </tbody>
        </table>
    [#else]
        <div>
            <em>Seznam lekcí je prázdný.</em>
        </div>
    [/#list]
</div>
</body>
</html>
