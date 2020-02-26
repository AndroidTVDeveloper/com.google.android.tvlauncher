package com.google.android.tvlauncher.util;

import android.app.job.JobParameters;
import android.app.job.JobService;

/* compiled from: PG */
public class NotifyRefreshOemConfigurationDataJobService extends JobService {
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        getSharedPreferences("oem_config", 0).edit().putBoolean("refresh_oem_configuration_data", true).apply();
        return false;
    }
}
