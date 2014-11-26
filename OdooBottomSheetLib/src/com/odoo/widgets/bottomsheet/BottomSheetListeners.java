package com.odoo.widgets.bottomsheet;

import android.view.MenuItem;

public class BottomSheetListeners {

	public static interface OnSheetItemClickListener {
		public void onItemClick(BottomSheet sheet, MenuItem menu, int menu_id);
	}
}
