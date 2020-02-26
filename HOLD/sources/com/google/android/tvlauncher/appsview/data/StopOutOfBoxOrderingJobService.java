package com.google.android.tvlauncher.appsview.data;

import android.app.job.JobParameters;
import android.app.job.JobService;

/* compiled from: PG */
public class StopOutOfBoxOrderingJobService extends JobService {
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        cja a = dbq.a(this);
        dck a2 = dck.a(a.a);
        if (!a.c || !a2.a()) {
            new ciz((byte) 0).execute(a.a);
        } else {
            a.i();
        }
        return false;
    }
}
