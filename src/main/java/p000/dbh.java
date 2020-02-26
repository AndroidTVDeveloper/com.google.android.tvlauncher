package p000;

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

/* renamed from: dbh */
/* compiled from: PG */
public final class dbh {

    /* renamed from: a */
    public final Object f8143a = new Object();

    /* renamed from: b */
    public boolean f8144b;

    /* renamed from: c */
    private final Context f8145c;

    /* renamed from: d */
    private final ContentObserver f8146d;

    /* renamed from: e */
    private final List f8147e = new ArrayList();

    /* renamed from: f */
    private final Set f8148f = new HashSet();

    public dbh(Context context) {
        this.f8145c = context;
        HandlerThread handlerThread = new HandlerThread("google config");
        handlerThread.start();
        this.f8146d = new dbg(this, new Handler(handlerThread.getLooper()));
        try {
            this.f8145c.getContentResolver().registerContentObserver(dag.f8042a, true, this.f8146d);
        } catch (SecurityException e) {
            String valueOf = String.valueOf(dag.f8042a);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 41);
            sb.append("Cannot register ContentObserver for Uri: ");
            sb.append(valueOf);
            Log.e("GoogleConfigManager", sb.toString());
        }
    }

    /* renamed from: a */
    public final dbf mo4066a() {
        dbf dbf;
        boolean z;
        synchronized (this.f8143a) {
            if (!this.f8144b) {
                this.f8147e.clear();
                this.f8148f.clear();
                Cursor query = this.f8145c.getContentResolver().query(dag.f8042a, null, null, null, null);
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
                                this.f8148f.add(dai.m6054a("com.google.android.tvrecommendations", string));
                            }
                            if (i != -1) {
                                List list = this.f8147e;
                                dah dah = new dah();
                                dah.f8043a = "com.google.android.tvrecommendations";
                                dah.f8044b = string;
                                dah.f8045c = i;
                                dah.f8046d = z;
                                dah.f8047e = true;
                                dah.f8048f = z2;
                                dah.f8049g = z3;
                                list.add(dah.mo4034a());
                            }
                        } catch (Throwable th) {
                            dhr.m6455a(th, th);
                        }
                    }
                    this.f8144b = true;
                } else {
                    this.f8144b = false;
                }
                if (query != null) {
                    query.close();
                }
            }
            if (this.f8144b) {
                dbf = new dbf(this.f8147e, this.f8148f);
            } else {
                dbf = null;
            }
        }
        return dbf;
        throw th;
    }
}
