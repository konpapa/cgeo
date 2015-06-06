import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

public class DialogWaypointActivity extends DialogFragment {

	AlertDialog.Builder alertDialog = new AlertDialog.Builder(AlertDialogActivity.this);

	// Setting Dialog Title
        alertDialog.setTitle("Save Changes...");

        // Setting Dialog Message
        alertDialog.setMessage("Do you want to save changes?");

        // Setting Icon to Dialog
        alertDialog.setIcon(R.drawable.save);

        // Setting Positive "Yes" Button
        alertDialog.setPositiveButton("YES", new DialogInterface.OnClickListener() {
        	public void onClick(DialogInterface dialog, int which) {
        	// User pressed YES button. Write Logic Here
        	EditWaypointActivity.saveWaypoint();
        	Toast.makeText(getApplicationContext(), "Your changes have been saved",
                	Toast.LENGTH_SHORT).show();
                }
        });

        // Setting Negative "Discard" Button
        alertDialog.setNegativeButton("Discard", new DialogInterface.OnClickListener() {
        public void onClick(DialogInterface dialog, int which) {
        	// User pressed Discard button. Write Logic Here
                Toast.makeText(getApplicationContext(), "Your changes have not been saved", Toast.LENGTH_SHORT).show();
                }
        });

        // Showing Alert Message
        alertDialog.show();
}