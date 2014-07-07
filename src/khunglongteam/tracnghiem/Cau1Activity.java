package khunglongteam.tracnghiem;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RadioGroup;

public class Cau1Activity extends Activity {
	
	RadioGroup radiogroup_cau1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cau1);
		
		radiogroup_cau1 = (RadioGroup) findViewById(R.id.radioGroupCau1);
		radiogroup_cau1.setOnClickListener(new myClickEvetn());
		
		
	}
	class myClickEvetn implements OnClickListener{

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			int isChecked = radiogroup_cau1.getCheckedRadioButtonId();
			if ((isChecked == R.id.radioA)| isChecked == R.id.radioB | isChecked == R.id.radioC ){
				Intent Cau2_Intent = new Intent(Cau1Activity.this,Cau2Activity.class);
				startActivity(Cau2_Intent);
			}
		}
		
	}
}
