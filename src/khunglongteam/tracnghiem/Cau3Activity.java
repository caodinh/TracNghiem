package khunglongteam.tracnghiem;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;

public class Cau3Activity extends Activity {
	
	Button btn_Chonlai;
	RadioGroup radiogroup_dapan;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cau3);
		btn_Chonlai = (Button) findViewById(R.id.btnChonlai);
		btn_Chonlai.setOnClickListener(new myClickEvent());
		
		radiogroup_dapan = (RadioGroup) findViewById(R.id.radioGroup);
		radiogroup_dapan.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				int pos;
				pos = radiogroup_dapan.indexOfChild(findViewById(checkedId));
				
				if (pos == 0| pos == 1| pos == 2){
					Intent Cau4_Intent = new Intent(Cau3Activity.this,Cau4Activity.class);
					startActivity(Cau4_Intent);
				}
			}
		});
	}
		
	
	
	class myClickEvent implements OnClickListener{

		@Override
		public void onClick(View v) {
			if (v == btn_Chonlai){
				finish();
			}
		}
		
	}
	
}
