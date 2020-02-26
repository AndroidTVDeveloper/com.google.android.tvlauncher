package defpackage;

import android.app.ApplicationErrorReport;
import android.os.Bundle;
import android.text.TextUtils;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

/* renamed from: buw  reason: default package */
/* compiled from: PG */
public final class buw {
    public final Bundle a = new Bundle();
    public String b;
    public String c;
    public boolean d;
    public ApplicationErrorReport e;
    private final List f = new ArrayList();
    private final String g;

    @Deprecated
    public buw() {
        long currentTimeMillis = System.currentTimeMillis();
        long abs = Math.abs(new SecureRandom().nextLong());
        StringBuilder sb = new StringBuilder(41);
        sb.append(currentTimeMillis);
        sb.append("-");
        sb.append(abs);
        this.g = sb.toString();
    }

    public buw(byte b2) {
        long currentTimeMillis = System.currentTimeMillis();
        long abs = Math.abs(new SecureRandom().nextLong());
        StringBuilder sb = new StringBuilder(41);
        sb.append(currentTimeMillis);
        sb.append("-");
        sb.append(abs);
        this.g = sb.toString();
        ApplicationErrorReport applicationErrorReport = new ApplicationErrorReport();
        this.e = applicationErrorReport;
        applicationErrorReport.crashInfo = new ApplicationErrorReport.CrashInfo();
        this.e.crashInfo.throwLineNumber = -1;
    }

    public final bux a() {
        buh.a((Object) this.e.crashInfo.exceptionClassName);
        buh.a((Object) this.e.crashInfo.throwClassName);
        buh.a((Object) this.e.crashInfo.throwMethodName);
        buh.a((Object) this.e.crashInfo.stackTrace);
        if (TextUtils.isEmpty(this.e.crashInfo.throwFileName)) {
            this.e.crashInfo.throwFileName = "unknown";
        }
        bux bux = new bux(new ApplicationErrorReport());
        bux.m = null;
        bux.f = null;
        bux.a = null;
        bux.c = this.b;
        bux.b = this.a;
        bux.e = this.c;
        bux.h = this.f;
        bux.i = this.d;
        bux.j = null;
        bux.k = null;
        bux.l = false;
        bux.n = this.g;
        bux.o = false;
        bux.p = 0;
        bux.d.crashInfo = this.e.crashInfo;
        bux.g = null;
        return bux;
    }
}
