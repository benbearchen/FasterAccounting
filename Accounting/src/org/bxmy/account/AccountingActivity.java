package org.bxmy.account;

import android.app.TabActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TabHost;
import android.widget.TabHost.OnTabChangeListener;
import android.widget.TabHost.TabSpec;

public class AccountingActivity extends TabActivity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		TabHost tabHost = getTabHost();
		tabHost.setOnTabChangedListener(onTabChangeListener);

		TabSpec quickBookTab = tabHost.newTabSpec(TAB_QUICK_BOOK);
		quickBookTab.setIndicator("快速记账");
		quickBookTab.setContent(R.id.frame_quick_book);
		tabHost.addTab(quickBookTab);
		
		TabSpec bookkeepingTab = tabHost.newTabSpec(TAB_BOOKKEEPING);
		bookkeepingTab.setIndicator("添加记账");
		bookkeepingTab.setContent(R.id.frame_bookkeeping);
		tabHost.addTab(bookkeepingTab);
		
		TabSpec accountTab = tabHost.newTabSpec(TAB_ACCOUNT);
		accountTab.setIndicator("账户");
		accountTab.setContent(R.id.frame_account);
		tabHost.addTab(accountTab);
		
		TabSpec historyTab = tabHost.newTabSpec(TAB_HISTORY);
		historyTab.setIndicator("历史");
		historyTab.setContent(R.id.frame_history);
		tabHost.addTab(historyTab);
		
		tabHost.setCurrentTab(0);
	}

	private TabHost.OnTabChangeListener onTabChangeListener = new OnTabChangeListener() {

		public void onTabChanged(String tabId) {
			if (tabId.equals(TAB_QUICK_BOOK)) {
				// TODO
			} else if (tabId.equals(TAB_BOOKKEEPING)) {
				// TODO
			} else if (tabId.equals(TAB_ACCOUNT)) {

			} else if (tabId.equals(TAB_HISTORY)) {

			} else {
				Log.e(TAG, "have not tabId: " + tabId);
			}
			return;

		}

	};

	private final String TAG = "AccountingActivity";

	private final String TAB_QUICK_BOOK = "TAB_QUICK_BOOK";
	private final String TAB_BOOKKEEPING = "TAB_BOOKKEEPING";
	private final String TAB_ACCOUNT = "TAB_ACCOUNT";
	private final String TAB_HISTORY = "TAB_HISTORY";
}
