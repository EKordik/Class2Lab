//Onload Window Load Function

$(function(){
    
    $('#enter').click(function(){
        var isValid = $('#nameForm').validate().form();
    });
    
    $.validator.setDefaults({
        errorElement: "span",
        errorClass: "form_error",
        errorPlacement: function(error,element){
            error.insertAfter(element)}
    });

    $('#nameForm').validate({
        rules: {
            name: {
                required: true,
                minlength: 2
            }
        },
        messages: {
            name: {
                required: "*<br>*This field is required<br>"
            }
        }
    });
})