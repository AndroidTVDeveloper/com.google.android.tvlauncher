package com.google.android.tvlauncher;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Handler;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
public class MainActivity extends cfc implements cfz {

    /* renamed from: c */
    private static final ConditionVariable f6363c = new ConditionVariable(false);

    /* renamed from: d */
    private final daf f6364d = new daf(this);

    /* renamed from: e */
    private final dbp f6365e = new dbp(this);

    public MainActivity() {
        super("Home", dhs.f8547k);
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 0) {
            if (i2 == -1) {
                this.f6364d.mo4033b();
            }
            m5243c();
        }
    }

    public final void onBackPressed() {
        cfg.m4645a().mo2703b(this);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        cga.m4692a().f5450a = this;
        new Handler().postDelayed(new cfe(this), 2000);
    }

    /* renamed from: a */
    public final void mo2709a(Bundle bundle) {
        if (this.f6365e.mo4072a()) {
            dbp dbp = this.f6365e;
            ConditionVariable conditionVariable = f6363c;
            conditionVariable.getClass();
            new dbm(new dbl(dbp), new cff(conditionVariable)).execute(dbp.f8157b);
            f6363c.block(4000);
            if (this.f6364d.mo4032a()) {
                m5243c();
            }
        }
        setContentView((int) R.layout.activity_main);
        if (bundle == null) {
            getFragmentManager().beginTransaction().add((int) R.id.home_view_container, new cqy()).commit();
        }
    }

    /* renamed from: a */
    public final void mo2743a() {
        reportFullyDrawn();
    }

    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Set<String> categories = intent.getCategories();
        if (categories != null && categories.contains("android.intent.category.HOME")) {
            cfg.m4645a().mo2705d(this);
        }
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        if (!this.f6364d.mo4032a()) {
            List<ResolveInfo> queryIntentActivities = this.f6364d.f8040a.getPackageManager().queryIntentActivities(new Intent("android.intent.action.TV_BOOT_COMPLETED"), 0);
            Intent intent = null;
            if (queryIntentActivities != null) {
                Iterator<ResolveInfo> it = queryIntentActivities.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ResolveInfo next = it.next();
                    if (dej.m6251a(next)) {
                        intent = new Intent();
                        intent.setComponent(new ComponentName(next.activityInfo.packageName, next.activityInfo.name));
                        break;
                    }
                }
            }
            if (intent == null) {
                this.f6364d.mo4033b();
                m5243c();
            } else {
                startActivityForResult(intent, 0);
            }
        } else {
            m5243c();
        }
        Intent a = dlk.m6963a(this, "com.android.tv.action.SHOW_UNSHOWN_NOTIFICATIONS", "android.tvservice.action.SHOW_UNSHOWN_NOTIFICATIONS");
        a.setPackage("com.google.android.tvrecommendations");
        sendBroadcast(a);
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        super.onStop();
        cga.m4692a().mo2746b();
    }

    public final void onUserInteraction() {
        cqy cqy = (cqy) getFragmentManager().findFragmentById(R.id.home_view_container);
        if (cqy != null) {
            cqy.mo3627b();
            if (cqy.f7045c) {
                cqy.f7049g.sendEmptyMessage(2);
            }
            cqy.f7049g.sendEmptyMessageDelayed(1, (long) cqy.f7046d);
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - cqy.f7047e > 14400000) {
                cfr cfr = cqy.f7044b;
                cfs cfs = new cfs(47);
                cfs.f5418a = true;
                cfr.mo2714a(cfs);
                cqy.f7047e = currentTimeMillis;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0084, code lost:
        if (p000.bwa.f4935b.booleanValue() != false) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01c3, code lost:
        if (r0.f8162g != false) goto L_0x01c5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x02a1  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x02fa  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0300  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0326  */
    /* JADX WARNING: Removed duplicated region for block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01eb  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m5243c() {
        /*
            r15 = this;
            java.lang.String r0 = "OemAppLauncher"
            java.lang.String r1 = "PhenotypeFlag"
            bwa r2 = p000.cyz.f7952a
            android.content.Context r3 = p000.bwa.f4934a
            if (r3 == 0) goto L_0x032e
            bvz r3 = r2.f4938c
            java.lang.String r3 = "gms:phenotype:phenotype_flag:debug_bypass_phenotype"
            r4 = 0
            r5 = 0
            boolean r6 = p000.bwa.m4293a()     // Catch:{ SecurityException -> 0x0043 }
            if (r6 == 0) goto L_0x0049
            bvw r6 = new bvw     // Catch:{ SecurityException -> 0x0043 }
            r6.<init>(r3)     // Catch:{ SecurityException -> 0x0043 }
            java.lang.Object r3 = p000.bwa.m4291a(r6)     // Catch:{ SecurityException -> 0x0043 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ SecurityException -> 0x0043 }
            boolean r3 = r3.booleanValue()     // Catch:{ SecurityException -> 0x0043 }
            if (r3 == 0) goto L_0x0049
            java.lang.String r3 = r2.f4939d
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r6 = "Bypass reading Phenotype values for flag: "
            int r7 = r3.length()
            if (r7 != 0) goto L_0x003b
            java.lang.String r3 = new java.lang.String
            r3.<init>(r6)
            goto L_0x003f
        L_0x003b:
            java.lang.String r3 = r6.concat(r3)
        L_0x003f:
            android.util.Log.w(r1, r3)
            goto L_0x0050
        L_0x0043:
            r3 = move-exception
            java.lang.String r6 = "Unable to read GServices, returning default value."
            android.util.Log.e(r1, r6, r3)
        L_0x0049:
            bvz r3 = r2.f4938c
            java.lang.String r3 = r3.f4927a
            if (r3 != 0) goto L_0x0053
        L_0x004f:
        L_0x0050:
            r3 = r5
            goto L_0x00d2
        L_0x0053:
            int r3 = android.os.Build.VERSION.SDK_INT
            android.content.Context r3 = p000.bwa.f4934a
            boolean r3 = r3.isDeviceProtectedStorage()
            if (r3 != 0) goto L_0x0086
            java.lang.Boolean r3 = p000.bwa.f4935b
            if (r3 != 0) goto L_0x0062
            goto L_0x006a
        L_0x0062:
            java.lang.Boolean r3 = p000.bwa.f4935b
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L_0x007e
        L_0x006a:
            android.content.Context r3 = p000.bwa.f4934a
            java.lang.Class<android.os.UserManager> r6 = android.os.UserManager.class
            java.lang.Object r3 = r3.getSystemService(r6)
            android.os.UserManager r3 = (android.os.UserManager) r3
            boolean r3 = r3.isUserUnlocked()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            p000.bwa.f4935b = r3
        L_0x007e:
            java.lang.Boolean r3 = p000.bwa.f4935b
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x004f
        L_0x0086:
            android.content.SharedPreferences r3 = r2.f4942g
            if (r3 != 0) goto L_0x0096
            android.content.Context r3 = p000.bwa.f4934a
            bvz r6 = r2.f4938c
            java.lang.String r6 = r6.f4927a
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r6, r4)
            r2.f4942g = r3
        L_0x0096:
            android.content.SharedPreferences r3 = r2.f4942g
            java.lang.String r6 = r2.f4939d
            boolean r6 = r3.contains(r6)
            if (r6 == 0) goto L_0x00d0
            r6 = r2
            bvx r6 = (p000.bvx) r6     // Catch:{ ClassCastException -> 0x00ae }
            java.lang.String r6 = r6.f4939d     // Catch:{ ClassCastException -> 0x00ae }
            boolean r3 = r3.getBoolean(r6, r4)     // Catch:{ ClassCastException -> 0x00ae }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ ClassCastException -> 0x00ae }
            goto L_0x00d2
        L_0x00ae:
            r3 = move-exception
            r6 = r2
            bvx r6 = (p000.bvx) r6
            java.lang.String r6 = r6.f4939d
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r7 = "Invalid boolean value in SharedPreferences for "
            int r8 = r6.length()
            if (r8 != 0) goto L_0x00c6
            java.lang.String r6 = new java.lang.String
            r6.<init>(r7)
            goto L_0x00ca
        L_0x00c6:
            java.lang.String r6 = r7.concat(r6)
        L_0x00ca:
            android.util.Log.e(r1, r6, r3)
            r3 = r5
            goto L_0x00d2
        L_0x00d0:
            goto L_0x004f
        L_0x00d2:
            r6 = 1
            if (r3 == 0) goto L_0x00d7
            goto L_0x0166
        L_0x00d7:
            boolean r3 = p000.bwa.m4293a()
            if (r3 == 0) goto L_0x0161
            bvv r3 = new bvv     // Catch:{ SecurityException -> 0x0142 }
            r3.<init>(r2)     // Catch:{ SecurityException -> 0x0142 }
            java.lang.Object r3 = p000.bwa.m4291a(r3)     // Catch:{ SecurityException -> 0x0142 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ SecurityException -> 0x0142 }
            if (r3 == 0) goto L_0x0141
            java.util.regex.Pattern r7 = p000.byi.f5005b     // Catch:{ SecurityException -> 0x0142 }
            java.util.regex.Matcher r7 = r7.matcher(r3)     // Catch:{ SecurityException -> 0x0142 }
            boolean r7 = r7.matches()     // Catch:{ SecurityException -> 0x0142 }
            if (r7 != 0) goto L_0x013a
            java.util.regex.Pattern r7 = p000.byi.f5006c     // Catch:{ SecurityException -> 0x0142 }
            java.util.regex.Matcher r7 = r7.matcher(r3)     // Catch:{ SecurityException -> 0x0142 }
            boolean r7 = r7.matches()     // Catch:{ SecurityException -> 0x0142 }
            if (r7 != 0) goto L_0x0133
            r7 = r2
            bvx r7 = (p000.bvx) r7     // Catch:{ SecurityException -> 0x0142 }
            java.lang.String r7 = r7.f4939d     // Catch:{ SecurityException -> 0x0142 }
            java.lang.String r8 = java.lang.String.valueOf(r7)     // Catch:{ SecurityException -> 0x0142 }
            int r8 = r8.length()     // Catch:{ SecurityException -> 0x0142 }
            int r9 = r3.length()     // Catch:{ SecurityException -> 0x0142 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ SecurityException -> 0x0142 }
            int r8 = r8 + 28
            int r8 = r8 + r9
            r10.<init>(r8)     // Catch:{ SecurityException -> 0x0142 }
            java.lang.String r8 = "Invalid boolean value for "
            r10.append(r8)     // Catch:{ SecurityException -> 0x0142 }
            r10.append(r7)     // Catch:{ SecurityException -> 0x0142 }
            java.lang.String r7 = ": "
            r10.append(r7)     // Catch:{ SecurityException -> 0x0142 }
            r10.append(r3)     // Catch:{ SecurityException -> 0x0142 }
            java.lang.String r3 = r10.toString()     // Catch:{ SecurityException -> 0x0142 }
            android.util.Log.e(r1, r3)     // Catch:{ SecurityException -> 0x0142 }
            goto L_0x0161
        L_0x0133:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)     // Catch:{ SecurityException -> 0x0142 }
            r3 = r1
            goto L_0x0162
        L_0x013a:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r6)     // Catch:{ SecurityException -> 0x0142 }
            r3 = r1
            goto L_0x0162
        L_0x0141:
            goto L_0x0161
        L_0x0142:
            r3 = move-exception
            java.lang.String r7 = r2.f4939d
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r8 = "Unable to read GServices for flag: "
            int r9 = r7.length()
            if (r9 != 0) goto L_0x0157
            java.lang.String r7 = new java.lang.String
            r7.<init>(r8)
            goto L_0x015b
        L_0x0157:
            java.lang.String r7 = r8.concat(r7)
        L_0x015b:
            android.util.Log.e(r1, r7, r3)
            r3 = r5
            goto L_0x0162
        L_0x0161:
            r3 = r5
        L_0x0162:
            if (r3 != 0) goto L_0x0166
            java.lang.Object r3 = r2.f4941f
        L_0x0166:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r1 = r3.booleanValue()
            java.lang.String r2 = "launch_boot_count"
            r3 = -1
            java.lang.String r7 = "current_sdk_int"
            if (r1 != 0) goto L_0x01eb
            dbp r0 = r15.f6365e
            boolean r1 = r0.f8164i
            if (r1 == 0) goto L_0x032d
            boolean r0 = r0.mo4072a()
            if (r0 == 0) goto L_0x032d
            dbp r0 = r15.f6365e
            java.lang.String r1 = r0.f8159d
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x01cc
            boolean r1 = r0.f8163h
            if (r1 != 0) goto L_0x018e
            goto L_0x0192
        L_0x018e:
            boolean r1 = r0.f8161f
            if (r1 != 0) goto L_0x01c5
        L_0x0192:
            android.content.Context r1 = r0.f8157b
            android.content.SharedPreferences r1 = android.preference.PreferenceManager.getDefaultSharedPreferences(r1)
            int r5 = r1.getInt(r7, r3)
            if (r5 != r3) goto L_0x01ab
            int r5 = android.os.Build.VERSION.SDK_INT
            android.content.SharedPreferences$Editor r3 = r1.edit()
            android.content.SharedPreferences$Editor r3 = r3.putInt(r7, r5)
            r3.apply()
        L_0x01ab:
            int r3 = android.os.Build.VERSION.SDK_INT
            if (r5 == r3) goto L_0x01bb
            android.content.SharedPreferences$Editor r1 = r1.edit()
            android.content.SharedPreferences$Editor r1 = r1.putInt(r7, r5)
            r1.apply()
            goto L_0x01ce
        L_0x01bb:
            int r1 = r0.mo4074b()
            if (r1 == r6) goto L_0x01cd
            boolean r1 = r0.f8162g
            if (r1 == 0) goto L_0x01cc
        L_0x01c5:
            java.lang.String r1 = r0.f8159d
            boolean r4 = r0.mo4073a(r1)
            goto L_0x01ce
        L_0x01cc:
        L_0x01cd:
        L_0x01ce:
            android.content.Context r1 = r0.f8157b
            android.content.SharedPreferences r1 = android.preference.PreferenceManager.getDefaultSharedPreferences(r1)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            int r3 = r0.mo4074b()
            android.content.SharedPreferences$Editor r1 = r1.putInt(r2, r3)
            r1.apply()
            r0.f8158c = r6
            if (r4 == 0) goto L_0x032d
            r15.finish()
            return
        L_0x01eb:
            dbp r1 = r15.f6365e
            boolean r8 = r1.f8164i
            if (r8 == 0) goto L_0x032d
            java.lang.String r1 = r1.f8160e
            dck r8 = p000.dck.m6123a(r15)
            java.lang.String r8 = r8.mo4103j()
            dck r9 = p000.dck.m6123a(r15)
            boolean r9 = r9.mo4102i()
            dck r10 = p000.dck.m6123a(r15)
            dcn r10 = r10.f8228e
            boolean r10 = r10.f8282q
            android.content.SharedPreferences r11 = android.preference.PreferenceManager.getDefaultSharedPreferences(r15)
            int r12 = r11.getInt(r2, r3)
            android.content.ContentResolver r13 = r15.getContentResolver()
            java.lang.String r14 = "boot_count"
            int r13 = android.provider.Settings.Global.getInt(r13, r14, r4)
            if (r12 >= r13) goto L_0x022c
            android.content.SharedPreferences$Editor r11 = r11.edit()
            android.content.SharedPreferences$Editor r2 = r11.putInt(r2, r13)
            r2.apply()
            p000.del.f8379a = r6
        L_0x022c:
            boolean r2 = p000.del.f8379a
            if (r2 == 0) goto L_0x032d
            boolean r2 = android.text.TextUtils.isEmpty(r8)
            if (r2 != 0) goto L_0x032d
            boolean r1 = r8.equals(r1)
            android.content.SharedPreferences r2 = android.preference.PreferenceManager.getDefaultSharedPreferences(r15)
            int r3 = r2.getInt(r7, r3)
            int r11 = android.os.Build.VERSION.SDK_INT
            if (r3 == r11) goto L_0x0255
            android.content.SharedPreferences$Editor r2 = r2.edit()
            int r3 = android.os.Build.VERSION.SDK_INT
            android.content.SharedPreferences$Editor r2 = r2.putInt(r7, r3)
            r2.apply()
            p000.del.f8380b = r6
        L_0x0255:
            boolean r2 = p000.del.f8380b
            boolean r3 = p000.dhz.m6481a(r15)
            if (r3 == 0) goto L_0x025f
            if (r9 != 0) goto L_0x0263
        L_0x025f:
            if (r2 != 0) goto L_0x032d
            if (r1 == 0) goto L_0x032d
        L_0x0263:
            if (r10 != 0) goto L_0x0271
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "com.android.tv.action.FORCE_LAUNCH_ON_BOOT"
            r1.<init>(r2)
            r1.setPackage(r8)
            r5 = r1
            goto L_0x027d
        L_0x0271:
            android.content.pm.PackageManager r1 = r15.getPackageManager()
            android.content.Intent r1 = r1.getLeanbackLaunchIntentForPackage(r8)
            if (r1 != 0) goto L_0x027c
            goto L_0x0282
        L_0x027c:
            r5 = r1
        L_0x027d:
            r1 = 270532608(0x10200000, float:3.1554436E-29)
            r5.addFlags(r1)
        L_0x0282:
            android.content.pm.PackageManager r1 = r15.getPackageManager()
            if (r5 == 0) goto L_0x0294
            android.content.ComponentName r1 = r5.resolveActivity(r1)
            if (r1 != 0) goto L_0x028f
            goto L_0x0294
        L_0x028f:
            r15.startActivity(r5)
            goto L_0x0329
        L_0x0294:
            android.content.pm.PackageManager r1 = r15.getPackageManager()     // Catch:{ NameNotFoundException -> 0x02bd }
            android.content.pm.ApplicationInfo r1 = r1.getApplicationInfo(r8, r4)     // Catch:{ NameNotFoundException -> 0x02bd }
            boolean r1 = r1.enabled     // Catch:{ NameNotFoundException -> 0x02bd }
            if (r1 != 0) goto L_0x02a1
            goto L_0x02be
        L_0x02a1:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 99
            r1.<init>(r2)
            java.lang.String r2 = "Launch on wake/boot is misconfigured: use_main_intent is "
            r1.append(r2)
            r1.append(r10)
            java.lang.String r2 = " but no matching intent filter exists"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r0, r1)
            return
        L_0x02bd:
            r1 = move-exception
        L_0x02be:
            java.lang.String r1 = java.lang.String.valueOf(r8)
            int r1 = r1.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = r1 + 45
            r2.<init>(r1)
            java.lang.String r1 = "Package to launch on wake/boot "
            r2.append(r1)
            r2.append(r8)
            java.lang.String r1 = " was not found"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            android.util.Log.w(r0, r1)
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.intent.action.VIEW"
            r0.<init>(r1)
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            android.content.Intent r0 = r0.setFlags(r1)
            java.lang.String r1 = java.lang.String.valueOf(r8)
            java.lang.String r2 = "market://details?id="
            int r3 = r1.length()
            if (r3 != 0) goto L_0x0300
            java.lang.String r1 = new java.lang.String
            r1.<init>(r2)
            goto L_0x0304
        L_0x0300:
            java.lang.String r1 = r2.concat(r1)
        L_0x0304:
            android.net.Uri r1 = android.net.Uri.parse(r1)
            android.content.Intent r0 = r0.setData(r1)
            java.lang.String r1 = r15.getPackageName()
            java.lang.String r2 = "callerId"
            android.content.Intent r0 = r0.putExtra(r2, r1)
            java.lang.String r1 = "com.android.vending"
            android.content.Intent r0 = r0.setPackage(r1)
            android.content.pm.PackageManager r1 = r15.getPackageManager()
            android.content.ComponentName r1 = r0.resolveActivity(r1)
            if (r1 == 0) goto L_0x032d
            r15.startActivity(r0)
        L_0x0329:
            r15.finish()
            return
        L_0x032d:
            return
        L_0x032e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Must call PhenotypeFlag.init() first"
            r0.<init>(r1)
            goto L_0x0337
        L_0x0336:
            throw r0
        L_0x0337:
            goto L_0x0336
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.tvlauncher.MainActivity.m5243c():void");
    }
}
