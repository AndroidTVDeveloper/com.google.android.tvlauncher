package com.google.android.tvlauncher.appsview.data;

import android.app.job.JobParameters;
import android.app.job.JobService;

/* compiled from: PG */
public class StopOutOfBoxOrderingJobService extends JobService {
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        cja a = dbq.m6093a(this);
        dck a2 = dck.m6123a(a.f5679a);
        if (!a.f5681c || !a2.mo4092a()) {
            new ciz((byte) 0).execute(a.f5679a);
        } else {
            a.mo2903i();
        }
        return false;
    }
}
