package edu.wctc.android.timedif.android;

import edu.wctc.android.timediff.service.DateTimeService;
import edu.wctc.android.timediff.service.TimeService;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {

	private TimeService timeService;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		timeService = new DateTimeService();

		Button executeButton = (Button) findViewById(R.id.button1);
		executeButton.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		String startTime = ((EditText) findViewById(R.id.editText1)).getText()
				.toString();
		String endTime = ((EditText) findViewById(R.id.editText2)).getText()
				.toString();

		String difference = timeService.calculateDuration(startTime, endTime);

		((TextView) findViewById(R.id.textView1)).setText(difference);
	}

}
