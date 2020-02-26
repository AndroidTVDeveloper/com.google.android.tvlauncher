package defpackage;

import android.database.Cursor;
import android.util.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: ckb  reason: default package */
/* compiled from: PG */
final class ckb implements cjx {
    private final /* synthetic */ cke a;

    public /* synthetic */ ckb(cke cke) {
        this.a = cke;
    }

    public final void a(cjz cjz) {
    }

    public final void c(cjz cjz) {
    }

    public final void b(cjz cjz) {
        Cursor cursor = cjz.h;
        if (cursor == null) {
            try {
                String valueOf = String.valueOf(cjz);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 38);
                sb.append("Error loading program data with task: ");
                sb.append(valueOf);
                Log.e("DataSourceObserver", sb.toString());
                return;
            } catch (Throwable th) {
                dhr.a(th, th);
            }
        } else {
            dbc dbc = this.a.g;
            if (dbc != null) {
                if (dbc.e) {
                    cursor.close();
                    return;
                }
            }
            HashSet hashSet = new HashSet();
            Set set = (Set) cjz.g;
            while (cursor.moveToNext()) {
                long j = cursor.getLong(0);
                set.remove(Long.valueOf(j));
                long j2 = cursor.getLong(1);
                Long b = this.a.c.b(j);
                if (b == null || b.longValue() != j2) {
                    this.a.a(j2);
                    if (this.a.c.a(j2)) {
                        hashSet.add(Long.valueOf(j2));
                    }
                }
            }
            Iterator it = set.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Long b2 = this.a.c.b(((Long) it.next()).longValue());
                if (b2 != null && this.a.c.a().contains(b2)) {
                    hashSet.add(b2);
                } else if (b2 == null) {
                    hashSet.addAll(this.a.c.a());
                    break;
                }
            }
            if (!hashSet.isEmpty()) {
                cke cke = this.a;
                dbc dbc2 = cke.g;
                if (dbc2 != null) {
                    if (dbc2.e) {
                    }
                }
                cke.f.addAll(hashSet);
                cke.e();
            }
            cursor.close();
            return;
        }
        throw th;
    }

    public final void a(cjz cjz, Throwable th) {
        String valueOf = String.valueOf(cjz);
        String valueOf2 = String.valueOf(th);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20 + String.valueOf(valueOf2).length());
        sb.append("onTaskFailed: ");
        sb.append(valueOf);
        sb.append(", ex: ");
        sb.append(valueOf2);
        Log.e("DataSourceObserver", sb.toString());
    }
}
