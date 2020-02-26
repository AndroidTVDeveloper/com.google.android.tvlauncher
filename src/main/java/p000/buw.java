package p000;

import android.app.ApplicationErrorReport;
import android.os.Bundle;
import android.text.TextUtils;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

/* renamed from: buw */
/* compiled from: PG */
public final class buw {

    /* renamed from: a */
    public final Bundle f4865a = new Bundle();

    /* renamed from: b */
    public String f4866b;

    /* renamed from: c */
    public String f4867c;

    /* renamed from: d */
    public boolean f4868d;

    /* renamed from: e */
    public ApplicationErrorReport f4869e;

    /* renamed from: f */
    private final List f4870f = new ArrayList();

    /* renamed from: g */
    private final String f4871g;

    @Deprecated
    public buw() {
        long currentTimeMillis = System.currentTimeMillis();
        long abs = Math.abs(new SecureRandom().nextLong());
        StringBuilder sb = new StringBuilder(41);
        sb.append(currentTimeMillis);
        sb.append("-");
        sb.append(abs);
        this.f4871g = sb.toString();
    }

    public buw(byte b) {
        long currentTimeMillis = System.currentTimeMillis();
        long abs = Math.abs(new SecureRandom().nextLong());
        StringBuilder sb = new StringBuilder(41);
        sb.append(currentTimeMillis);
        sb.append("-");
        sb.append(abs);
        this.f4871g = sb.toString();
        ApplicationErrorReport applicationErrorReport = new ApplicationErrorReport();
        this.f4869e = applicationErrorReport;
        applicationErrorReport.crashInfo = new ApplicationErrorReport.CrashInfo();
        this.f4869e.crashInfo.throwLineNumber = -1;
    }

    /* renamed from: a */
    public final bux mo2456a() {
        buh.m4199a((Object) this.f4869e.crashInfo.exceptionClassName);
        buh.m4199a((Object) this.f4869e.crashInfo.throwClassName);
        buh.m4199a((Object) this.f4869e.crashInfo.throwMethodName);
        buh.m4199a((Object) this.f4869e.crashInfo.stackTrace);
        if (TextUtils.isEmpty(this.f4869e.crashInfo.throwFileName)) {
            this.f4869e.crashInfo.throwFileName = "unknown";
        }
        bux bux = new bux(new ApplicationErrorReport());
        bux.f4884m = null;
        bux.f4877f = null;
        bux.f4872a = null;
        bux.f4874c = this.f4866b;
        bux.f4873b = this.f4865a;
        bux.f4876e = this.f4867c;
        bux.f4879h = this.f4870f;
        bux.f4880i = this.f4868d;
        bux.f4881j = null;
        bux.f4882k = null;
        bux.f4883l = false;
        bux.f4885n = this.f4871g;
        bux.f4886o = false;
        bux.f4887p = 0;
        bux.f4875d.crashInfo = this.f4869e.crashInfo;
        bux.f4878g = null;
        return bux;
    }
}
