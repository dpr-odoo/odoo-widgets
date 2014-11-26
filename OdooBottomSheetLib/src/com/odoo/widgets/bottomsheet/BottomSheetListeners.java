package com.odoo.widgets.bottomsheet;

import android.view.MenuItem;

public class BottomSheetListeners {

	public static interface OnSheetItemClickListener {
		public void onItemClick(BottomSheet sheet, MenuItem menu, Object extras);
	}

	public static interface OnSheetActionClickListener {
		public void onSheetActionClick(BottomSheet sheet, Object extras);
	}
}
