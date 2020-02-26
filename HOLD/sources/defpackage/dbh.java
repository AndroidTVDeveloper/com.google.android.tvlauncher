package defpackage;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: dbh  reason: default package */
/* compiled from: PG */
public final class dbh {
    public final Object a = new Object();
    public boolean b;
    private final Context c;
    private final ContentObserver d;
    private final List e = new ArrayList();
    private final Set f = new HashSet();

    public dbh(Context context) {
        this.c = context;
        HandlerThread handlerThread = new HandlerThread("google config");
        handlerThread.start();
        this.d = new dbg(this, new Handler(handlerThread.getLooper()));
        try {
            this.c.getContentResolver().registerContentObserver(dag.a, true, this.d);
        } catch (SecurityException e2) {
            String valueOf = String.valueOf(dag.a);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 41);
            sb.append("Cannot register ContentObserver for Uri: ");
            sb.append(valueOf);
            Log.e("GoogleConfigManager", sb.toString());
        }
    }

    public final dbf a() {
        dbf dbf;
        boolean z;
        synchronized (this.a) {
            if (!this.b) {
                this.e.clear();
                this.f.clear();
                Cursor query = this.c.getContentResolver().query(dag.a, null, null, null, null);
                if (query != null) {
                    while (query.moveToNext()) {
                        try {
                            boolean z2 = query.getInt(query.getColumnIndex("can_move")) == 1;
                            boolean z3 = query.getInt(query.getColumnIndex("can_hide")) == 1;
                            if (z2 ^ z3) {
                                StringBuilder sb = new StringBuilder(113);
                                sb.append("Combination of can_move=");
                                sb.append(z2);
                                sb.append(" and ");
                                sb.append("can_hide");
                                sb.append("=");
                                sb.append(z3);
                                sb.append(" is not supported. Only both \"true\" or both \"false\" are supported");
                                Log.e("GoogleConfigManager", sb.toString());
                                z2 = true;
                                z3 = true;
                            }
                            String string = query.getString(query.getColumnIndex("system_channel_key"));
                            int i = query.getInt(query.getColumnIndex("position"));
                            if (query.getInt(query.getColumnIndex("sponsored")) == 1) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                this.f.add(dai.a("com.google.android.tvrecommendations", string));
                            }
                            if (i != -1) {
                                List list = this.e;
                                dah dah = new dah();
                                dah.a = "com.google.android.tvrecommendations";
                                dah.b = string;
                                dah.c = i;
                                dah.d = z;
                                dah.e = true;
                                dah.f = z2;
                                dah.g = z3;
                                list.add(dah.a());
                            }
                        } catch (Throwable th) {
                            dhr.a(th, th);
                        }
                    }
                    this.b = true;
                } else {
                    this.b = false;
                }
                if (query != null) {
                    query.close();
                }
            }
            if (this.b) {
                dbf = new dbf(this.e, this.f);
            } else {
                dbf = null;
            }
        }
        return dbf;
        throw th;
    }
}
