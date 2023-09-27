public class node {
    int data;
    node next;
    
    
}
function equals() {
    var txt = document.form.textview.value;
    try {
        if (txt) {
            var result = eval(txt);
            if (isNaN(result) || !isFinite(result)) {
                document.form.textview.value = 'ERROR';
            } else {
                document.form.textview.value = result;
            }
        } else {
            document.form.textview.value = 'ERROR';
        }
    } catch (error) {
        document.form.textview.value = 'ERROR';
    }
}
https://ahmedsaheel.github.io/Ahmed_portfolio/
