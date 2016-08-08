package com.example.criminalintent;

import java.util.UUID;

import android.support.v4.app.Fragment;

import com.example.criminalintent.util.Utils;


public class CrimeActivity extends SingleFragmentActivity/*FragmentActivity */{

	@Override
	protected Fragment createFragment() {
		UUID  crimeId = (UUID) getIntent().getSerializableExtra(Utils.EXTRA_CRIME_ID);
		//return new CrimeFragment();
		
		return CrimeFragment.newInstance(crimeId);
	}

	
    /*@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
        
        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragment_container);
        
        if (fragment == null) {
        	fragment = new CrimeFragment();
        	fm.beginTransaction().add(R.id.fragment_container, fragment)
        	.commit();
        }
    }*/

}
