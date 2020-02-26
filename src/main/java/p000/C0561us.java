package p000;

import android.content.ContentResolver;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: us */
/* compiled from: PG */
public abstract class C0561us implements C0549ug {

    /* renamed from: a */
    private final Uri f10552a;

    /* renamed from: b */
    private final ContentResolver f10553b;

    /* renamed from: c */
    private Object f10554c;

    public C0561us(ContentResolver contentResolver, Uri uri) {
        this.f10553b = contentResolver;
        this.f10552a = uri;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo5997a(Uri uri, ContentResolver contentResolver);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo5998a(Object obj);

    /* renamed from: c */
    public final void mo9c() {
    }

    /* renamed from: d */
    public final int mo10d() {
        return 1;
    }

    /* renamed from: b */
    public final void mo8b() {
        Object obj = this.f10554c;
        if (obj != null) {
            try {
                mo5998a(obj);
            } catch (IOException e) {
            }
        }
    }

    /* renamed from: a */
    public final void mo7a(C0501sm smVar, C0548uf ufVar) {
        try {
            Object a = mo5997a(this.f10552a, this.f10553b);
            this.f10554c = a;
            ufVar.mo22a(a);
        } catch (FileNotFoundException e) {
            ufVar.mo21a((Exception) e);
        }
    }
}
