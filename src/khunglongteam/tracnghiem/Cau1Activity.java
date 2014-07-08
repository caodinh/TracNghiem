package khunglongteam.tracnghiem;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;

public class Cau1Activity extends Activity {
	
	RadioGroup radiogroup_cau1;
	int pos;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cau1);
		
		radiogroup_cau1 = (RadioGroup) findViewById(R.id.radioGroup);
		
		radiogroup_cau1.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				pos = radiogroup_cau1.indexOfChild(findViewById(checkedId));
				
				if (pos == 0| pos == 1| pos == 2){
					Intent Cau2_Intent = new Intent(Cau1Activity.this,Cau2Activity.class);
					startActivity(Cau2_Intent);
				}
			}
		});
		
	}
}
