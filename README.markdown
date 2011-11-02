#SectionsListAdapter#

Android list adapter that works with an interface just like iOS's tableview delegate (minus some of the features).  It has 3 major components:

###SectionsListAdapter class###

This class should be used as-is as your ListView's adapter

###SectionsListAdapterDelegate interface###

Most likely your ListActivity will implement this interface to act just like a UITableViewController.

###IndexPath class###

The SectionsListAdapter will send instances of this class to your ListActivity.
