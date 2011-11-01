*SectionsListAdapter*

It's an android list adapter that works with an interface just like iOS's tableview delegate (minus some of the features).  There are three basic parts:

***The SectionsListAdapter class***

This class should be used as-is as your ListView's adapter

***The SectionsListAdapterDelegate interface***

Most likely your ListActivity will implement this interface to act just like a UITableViewController.

***The IndexPath class***

The SectionsListAdapter will send instances of this class to your ListActivity.
