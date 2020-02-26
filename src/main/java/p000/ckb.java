package p000;

import android.database.Cursor;
import android.util.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: ckb */
/* compiled from: PG */
final class ckb implements cjx {

    /* renamed from: a */
    private final /* synthetic */ cke f5793a;

    public /* synthetic */ ckb(cke cke) {
        this.f5793a = cke;
    }

    /* renamed from: a */
    public final void mo2941a(cjz cjz) {
    }

    /* renamed from: c */
    public final void mo2944c(cjz cjz) {
    }

    /* renamed from: b */
    public final void mo2943b(cjz cjz) {
        Cursor cursor = cjz.f5783h;
        if (cursor == null) {
            try {
                String valueOf = String.valueOf(cjz);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 38);
                sb.append("Error loading program data with task: ");
                sb.append(valueOf);
                Log.e("DataSourceObserver", sb.toString());
                return;
            } catch (Throwable th) {
                dhr.m6455a(th, th);
            }
        } else {
            dbc dbc = this.f5793a.f5802g;
            if (dbc != null) {
                if (dbc.f8134e) {
                    cursor.close();
                    return;
                }
            }
            HashSet hashSet = new HashSet();
            Set set = (Set) cjz.f5782g;
            while (cursor.moveToNext()) {
                long j = cursor.getLong(0);
                set.remove(Long.valueOf(j));
                long j2 = cursor.getLong(1);
                Long b = this.f5793a.f5798c.mo2967b(j);
                if (b == null || b.longValue() != j2) {
                    this.f5793a.mo2970a(j2);
                    if (this.f5793a.f5798c.mo2966a(j2)) {
                        hashSet.add(Long.valueOf(j2));
                    }
                }
            }
            Iterator it = set.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Long b2 = this.f5793a.f5798c.mo2967b(((Long) it.next()).longValue());
                if (b2 != null && this.f5793a.f5798c.mo2965a().contains(b2)) {
                    hashSet.add(b2);
                } else if (b2 == null) {
                    hashSet.addAll(this.f5793a.f5798c.mo2965a());
                    break;
                }
            }
            if (!hashSet.isEmpty()) {
                cke cke = this.f5793a;
                dbc dbc2 = cke.f5802g;
                if (dbc2 != null) {
                    if (dbc2.f8134e) {
                    }
                }
                cke.f5801f.addAll(hashSet);
                cke.mo2975e();
            }
            cursor.close();
            return;
        }
        throw th;
    }

    /* renamed from: a */
    public final void mo2942a(cjz cjz, Throwable th) {
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
