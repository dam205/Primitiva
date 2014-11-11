package fernandowirtz.primitiva;

import android.support.v7.app.ActionBarActivity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {
	TextView texto;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		texto = (TextView) findViewById(R.id.campoNumeros);
		SharedPreferences prefer = getSharedPreferences("guardado",
				Context.MODE_PRIVATE);
		texto.setText(prefer.getString("numerosPrimitiva", ""));
	}

	public void onClickButton(View view) {
		Primitiva pri = new Primitiva();
		texto.setText(pri.calcular());
		SharedPreferences preferencias = getSharedPreferences("guardado",
				Context.MODE_PRIVATE);
		Editor editor = preferencias.edit();
		editor.putString("numerosPrimitiva", texto.getText().toString());
		editor.commit();
		// finish();

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
