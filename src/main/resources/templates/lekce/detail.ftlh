[#ftl]
<!DOCTYPE html>
<html lang="cs">
<head>
    [#include '/_common/head.ftlh']
</head>
<body>

<div class="container">
    [#include '/_common/header.ftlh']

    <div class="card" style="width: 18rem;">
        <div class="card-header">
            <h5 class="card-title">${lekce.nazev}</h5>
        </div>
        <div class="card-body">
            <p class="card-text">Místo: ${lekce.misto}</p>
        </div>
        <div class="card-footer text-body-secondary">
            ${lekce.datum?date} ${lekce.casOd?time}–${lekce.casDo?time}
        </div>
    </div>
</div>
</body>
</html>
