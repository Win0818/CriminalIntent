package com.example.criminalintent.util;

import java.util.UUID;

import android.content.Context;
import android.content.Intent;

import com.example.criminalintent.CrimeActivity;

public class Utils {

	public static final String EXTRA_CRIME_ID =
			"com.bignerdranch.android.criminalintent.crime_id";
	
	public static Intent newIntent(Context packageContext, UUID crimeId) {
		Intent intent = new Intent(packageContext, CrimeActivity.class);
		intent.putExtra(EXTRA_CRIME_ID, crimeId);
		return intent;
	}
}
