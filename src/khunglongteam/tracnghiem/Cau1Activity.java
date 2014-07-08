package khunglongteam.tracnghiem;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.Toast;

public class Cau1Activity extends Activity {
	
	RadioGroup radiogroup_cau1;
	RadioButton radiobutton_A, radiobutton_B, radiobutton_C;
	int pos;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cau1);
		
		radiogroup_cau1 = (RadioGroup) findViewById(R.id.radioGroupCau1);
		
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
	
//	class myClickEvetn implements OnClickListener{
//
//		@Override
//		public void onClick(View v) {
			// TODO Auto-generated method stub
//			int isChecked = radiogroup_cau1.getCheckedRadioButtonId();
//			if ((v == radiogroup_cau1) ){
////				Intent Cau2_Intent = new Intent(Cau1Activity.this,Cau2Activity.class);
////				startActivity(Cau2_Intent);
//				Toast toast = Toast.makeText(Cau1Activity.this, "Bạn đã chọn đáp án D", Toast.LENGTH_SHORT);
//				toast.show();
//			}
//			else if (v == radiobutton_D){
////				Toast toast = Toast.makeText(Cau1Activity.this, "Bạn đã chọn đáp án D", Toast.LENGTH_SHORT);
////				toast.show();
//				Intent Cau2_Intent = new Intent(Cau1Activity.this,Cau2Activity.class);
//				startActivity(Cau2_Intent);
//			}
//		}
		
}
