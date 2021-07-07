
$(function () {

    $(document).on('click', '#test-button', function (ev) {
        var request = {
          message: $('#test-request').val()
        };

        $.ajax({
            type: 'POST',
            data: JSON.stringify(request),
            url: '/test_request',
            contentType: 'application/json',
            dataType: 'json',
            success: function (response) {
                console.log(response);
                $('.test-response').html(response.message);
            },
            error: function (XMLHttpRequest, textStatus, errorThrown) {
                alert('Error');
            }
        });
    });



});