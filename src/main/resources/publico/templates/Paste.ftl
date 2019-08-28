<#include "header.ftl">
<#include "nav.ftl">

<div class="container" id="paste-bin">

    <div class="panel panel-primary" style="width:1200px; margin-left: 30px">
        <div class="panel-heading">CREAR</div>
        <div class="panel-body">

            <form action="/paste/" method="post" name="myForm" onsubmit="return(validate());" >
                <div class="row">
                    <div class="col-md-offset col-md-11">
                        <div class="form-group">
                            <label for="title">Titulo</label>
                            <input type="text" class="form-control" name="title" id="title"
                                   placeholder="Introduzca el título">
                        </div>
                        <div class="form-group">
                            <label for="bloqueDeTexto">Texto</label>
                            <textarea class="form-control" name="bloqueDeTexto" id="bloqueDeTexto" cols="80"
                                      rows="20"></textarea>
                            <p id="demo"></p>
                        </div>
                        <div class="form-group">
                            <label for="expositionType">Privacidad</label>
                            <select class="form-control" name="expositionType" id="expositionType">
                                <option selected="disabled">Seleccionar</option>
                                <option>public</option>
                                <option>privado</option>
                                <option>unlistd</option>
                            </select>
                        </div>
                        <div class="form-group">
                            <label for="expirationDate">Fecha de Expiracion</label>
                            <select class="form-control" name="expirationDate" id="expirationDate">
                                <option selected="disabled">Seleccionar</option>
                                <option>Nunca</option>
                                <option>10 minutos</option>
                                <option>15 minutos</option>
                                <option>30 minutos</option>
                                <option>1 hora</option>
                                <option>1 dia</option>
                                <option>1 week</option>
                            </select>
                        </div>
                        <div class="form-group">
                            <label for="syntax">Syntaxy</label>
                            <select class="form-control" name="syntax" id="syntax">
                                <option selected="disabled">Seleccionar</option>
                                <option>java</option>
                                <option>javascript</option>
                                <option>makefile</option>
                                <option>markdown</option>
                                <option>ngnix</option>
                                <option>objective-C</option>
                                <option>apache</option>
                                <option>bash</option>
                                <option>c#</option>
                                <option>c++</option>
                                <option>css</option>
                                <option>html</option>
                                <option>xml</option>
                                <option>http</option>
                                <option>ini</option>
                                <option>json</option>
                            </select>
                        </div>

                        <div class="row">
                            <div class="col-md-6">
                                <div class="form-group">
                                    <button class="btn btn-primary form-control" type="submit">Agregar
                                    </button>
                                </div>
                            </div>
                        </div>

                    </div>
            </form>
        </div>
    </div>

</div>

<script type="text/javascript">

    function validate() {

        if (document.myForm.title.value === "") {
            alert("Please provide the title of the form");
            document.myForm.title.focus();
            return false;
        }

        if (document.myForm.bloqueDeTexto.value == "") {
            alert("Please provide the text block of the form");
            document.myForm.bloqueDeTexto.focus();
            return false;
        }

        if (document.myForm.syntax.value === "Select One")
        {
            alert('Please enter Syntax name');
            document.getElementById('syntax').style.borderColor = "red";
            return false;
        }

        if (document.myForm.expirationDate.value === "Select One")
        {
            alert('Please enter expiration date');
            document.getElementById('expirationDate').style.borderColor = "red";
            return false;
        }

        if (document.myForm.expositionType.value === "Select One")
        {
            alert('Please enter expiration date');
            document.getElementById('expositionType').style.borderColor = "red";
            return false;
        }

    }



</script>
<#include "footer.ftl">

