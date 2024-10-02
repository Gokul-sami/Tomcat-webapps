// Function to check if age is within the range and gender is valid
function validateAgeAndGender(event) {
    var age = document.getElementById('Age').value; // Get age input
    var gender = document.getElementById('country').value; // Get gender selection

    // Check if age is between 10 and 100
    if (age < 1 || age > 100) {
        alert('Age must be between 1 and 100.');
        event.preventDefault();  // Prevent form submission
        return false;
    }

    // Check if gender is either "Male" or "Female"
    if (gender !== "Male" && gender !== "Female") {
        alert('Please select a valid gender (Male or Female).');
        event.preventDefault();  // Prevent form submission
        return false;
    }

    return true;  // Valid age and gender
}

// Function to check food checkbox selection
function validateFoodSelection(event) {
    var checkboxes = document.querySelectorAll('input[name="food"]');
    var maxSelection = 5; // Max allowed selections
    var minSelection = 1; // Min required selections
    var checkedCount = 0; // To count how many checkboxes are selected

    // Loop through each checkbox and count the checked ones
    for (var i = 0; i < checkboxes.length; i++) {
        if (checkboxes[i].checked) {
            checkedCount++;
        }
    }

    // If fewer than 1 item is selected, show an alert
    if (checkedCount < minSelection) {
        alert('You must select at least one food item.');
        event.preventDefault();  // Stop form submission
        return false;
    }

    // If more than 5 items are selected, show an alert
    if (checkedCount > maxSelection) {
        alert('You can only select up to 5 food items.');
        event.preventDefault();  // Stop form submission
        return false;
    }

    return true;  // If everything is fine, allow the form to submit
}

// Listen for the form submission event
var form = document.querySelector('form'); // Get the form element
form.addEventListener('submit', function (event) {
    // Check if the required fields (name, gender, etc.) are valid
    if (!form.checkValidity()) {
        event.preventDefault(); // Stop form submission if invalid
        event.stopPropagation(); // Stop further handling
        form.classList.add('was-validated');  // Show validation feedback (Bootstrap)
    } else if (!validateAgeAndGender(event) || !validateFoodSelection(event)) {
        event.preventDefault();  // Stop form submission if age/gender/food validation fails
    }
});
