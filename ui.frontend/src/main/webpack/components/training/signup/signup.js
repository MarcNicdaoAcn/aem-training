$("#signup").click(function (e) {
  $.post("/bin/training/signup", function (response) {
    const signup = documen;
  }).fail(function () {
    alert("Unfortunately, something went wrong.");
  });
});
