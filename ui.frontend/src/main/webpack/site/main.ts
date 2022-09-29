
// Stylesheets
import "./main.scss";

// Javascript or Typescript
import "../**/*.js";
import "../**/*.ts";

(function($) {

    var	$window = $(window),
        $body = $('body');

    // Play initial animations on page load.
    $window.on('load', function() {
        window.setTimeout(function() {
            $body.removeClass('is-preload');
        }, 100);
    });

    // Scrolly.
    $('.scrolly').scrolly();

});
