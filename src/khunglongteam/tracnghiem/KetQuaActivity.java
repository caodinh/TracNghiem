package khunglongteam.tracnghiem;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class KetQuaActivity extends Activity {
	
	Button btn_Choilai, btn_Thoat;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ket_qua);
		
		btn_Choilai = (Button) findViewById(R.id.btnChoilai);
		btn_Choilai.setOnClickListener(new myClickEvent());
		btn_Thoat = (Button) findViewById(R.id.btnThoat);
		btn_Thoat.setOnClickListener(new myClickEvent());
	}
	
	class myClickEvent implements OnClickListener{

		@Override
		public void onClick(View v) {
			if (v == btn_Choilai){
				Intent Choilai_Intent = new Intent(KetQuaActivity.this,Cau1Activity.class);
				startActivity(Choilai_Intent);
			}
			else if (v == btn_Thoat){
				finishAffinity();
			}
		}
		
	}
}
