package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: fo */
/* compiled from: PG */
public class C0152fo implements C0047bs {

    /* renamed from: h */
    private static final int[] f9302h = {1, 4, 5, 3, 2, 0};

    /* renamed from: a */
    public final Context f9303a;

    /* renamed from: b */
    public final ArrayList f9304b;

    /* renamed from: c */
    public boolean f9305c;

    /* renamed from: d */
    public final ArrayList f9306d;

    /* renamed from: e */
    public CharSequence f9307e;

    /* renamed from: f */
    public final CopyOnWriteArrayList f9308f = new CopyOnWriteArrayList();

    /* renamed from: g */
    public C0153fp f9309g;

    /* renamed from: i */
    private final Resources f9310i;

    /* renamed from: j */
    private boolean f9311j;

    /* renamed from: k */
    private final boolean f9312k;

    /* renamed from: l */
    private final ArrayList f9313l;

    /* renamed from: m */
    private final ArrayList f9314m;

    /* renamed from: n */
    private boolean f9315n;

    /* renamed from: o */
    private boolean f9316o = false;

    /* renamed from: p */
    private boolean f9317p = false;

    /* renamed from: q */
    private boolean f9318q = false;

    /* renamed from: r */
    private boolean f9319r = false;

    /* renamed from: s */
    private final ArrayList f9320s = new ArrayList();

    /* renamed from: t */
    private boolean f9321t = false;

    /* renamed from: a */
    public boolean mo4864a() {
        return this.f9321t;
    }

    /* renamed from: a */
    public boolean mo4867a(C0152fo foVar, MenuItem menuItem) {
        return false;
    }

    /* renamed from: b */
    public boolean mo4879b() {
        return this.f9311j;
    }

    /* renamed from: c */
    public boolean mo4881c() {
        return this.f9312k;
    }

    /* renamed from: i */
    public C0152fo mo4893i() {
        return this;
    }

    /* renamed from: k */
    public void mo4896k() {
    }

    public C0152fo(Context context) {
        boolean z = false;
        this.f9303a = context;
        this.f9310i = context.getResources();
        this.f9304b = new ArrayList();
        this.f9313l = new ArrayList();
        this.f9305c = true;
        this.f9306d = new ArrayList();
        this.f9314m = new ArrayList();
        this.f9315n = true;
        if (this.f9310i.getConfiguration().keyboard != 1 && C0108dy.m7225a(ViewConfiguration.get(this.f9303a), this.f9303a)) {
            z = true;
        }
        this.f9312k = z;
    }

    public final MenuItem add(int i) {
        return m7312a(0, 0, 0, this.f9310i.getString(i));
    }

    public final MenuItem add(int i, int i2, int i3, int i4) {
        return m7312a(i, i2, i3, this.f9310i.getString(i4));
    }

    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m7312a(i, i2, i3, charSequence);
    }

    public final MenuItem add(CharSequence charSequence) {
        return m7312a(0, 0, 0, charSequence);
    }

    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        PackageManager packageManager = this.f9303a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i5 = 0; i5 < size; i5++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i5);
            Intent intent2 = new Intent(resolveInfo.specificIndex >= 0 ? intentArr[resolveInfo.specificIndex] : intent);
            intent2.setComponent(new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
            MenuItem intent3 = m7312a(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && resolveInfo.specificIndex >= 0) {
                menuItemArr[resolveInfo.specificIndex] = intent3;
            }
        }
        return size;
    }

    /* renamed from: a */
    private final MenuItem m7312a(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = i3 >> 16;
        if (i5 >= 0) {
            int[] iArr = f9302h;
            if (i5 < iArr.length) {
                char c = (iArr[i5] << 16) | ((char) i3);
                C0153fp fpVar = new C0153fp(this, i, i2, i3, c, charSequence);
                ArrayList arrayList = this.f9304b;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        i4 = 0;
                        break;
                    } else if (((C0153fp) arrayList.get(size)).f9327c <= c) {
                        i4 = size + 1;
                        break;
                    }
                }
                arrayList.add(i4, fpVar);
                mo4878b(true);
                return fpVar;
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    /* renamed from: a */
    public final void mo4862a(C0159fv fvVar, Context context) {
        this.f9308f.add(new WeakReference(fvVar));
        fvVar.mo4827a(context, this);
        this.f9315n = true;
    }

    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f9310i.getString(i));
    }

    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.f9310i.getString(i4));
    }

    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C0153fp fpVar = (C0153fp) m7312a(i, i2, i3, charSequence);
        C0167gc gcVar = new C0167gc(this.f9303a, this, fpVar);
        fpVar.mo4908a(gcVar);
        return gcVar;
    }

    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void clear() {
        C0153fp fpVar = this.f9309g;
        if (fpVar != null) {
            mo4880b(fpVar);
        }
        this.f9304b.clear();
        mo4878b(true);
    }

    public final void clearHeader() {
        this.f9307e = null;
        mo4878b(false);
    }

    public final void close() {
        mo4863a(true);
    }

    /* renamed from: a */
    public final void mo4863a(boolean z) {
        if (!this.f9319r) {
            this.f9319r = true;
            Iterator it = this.f9308f.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C0159fv fvVar = (C0159fv) weakReference.get();
                if (fvVar == null) {
                    this.f9308f.remove(weakReference);
                } else {
                    fvVar.mo4828a(this, z);
                }
            }
            this.f9319r = false;
        }
    }

    /* renamed from: b */
    public boolean mo4880b(C0153fp fpVar) {
        boolean z = false;
        if (!this.f9308f.isEmpty() && this.f9309g == fpVar) {
            mo4885d();
            Iterator it = this.f9308f.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C0159fv fvVar = (C0159fv) weakReference.get();
                if (fvVar == null) {
                    this.f9308f.remove(weakReference);
                } else {
                    z = fvVar.mo4831a(fpVar);
                    if (z) {
                        break;
                    }
                }
            }
            mo4886e();
            if (z) {
                this.f9309g = null;
            }
        }
        return z;
    }

    /* renamed from: a */
    public boolean mo4868a(C0153fp fpVar) {
        boolean z = false;
        if (!this.f9308f.isEmpty()) {
            mo4885d();
            Iterator it = this.f9308f.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C0159fv fvVar = (C0159fv) weakReference.get();
                if (fvVar == null) {
                    this.f9308f.remove(weakReference);
                } else {
                    z = fvVar.mo4834b(fpVar);
                    if (z) {
                        break;
                    }
                }
            }
            mo4886e();
            if (z) {
                this.f9309g = fpVar;
            }
        }
        return z;
    }

    public final MenuItem findItem(int i) {
        MenuItem findItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            C0153fp fpVar = (C0153fp) this.f9304b.get(i2);
            if (fpVar.f9325a == i) {
                return fpVar;
            }
            if (fpVar.hasSubMenu() && (findItem = fpVar.f9334j.findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    /* renamed from: a */
    private final C0153fp m7313a(int i, KeyEvent keyEvent) {
        char c;
        ArrayList arrayList = this.f9320s;
        arrayList.clear();
        m7315a(arrayList, i, keyEvent);
        if (!arrayList.isEmpty()) {
            int metaState = keyEvent.getMetaState();
            KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
            keyEvent.getKeyData(keyData);
            int size = arrayList.size();
            if (size == 1) {
                return (C0153fp) arrayList.get(0);
            }
            boolean b = mo4879b();
            for (int i2 = 0; i2 < size; i2++) {
                C0153fp fpVar = (C0153fp) arrayList.get(i2);
                if (!b) {
                    c = fpVar.f9329e;
                } else {
                    c = fpVar.f9331g;
                }
                if ((c == keyData.meta[0] && (metaState & 2) == 0) || ((c == keyData.meta[2] && (metaState & 2) != 0) || (b && c == 8 && i == 67))) {
                    return fpVar;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    private final void m7315a(List list, int i, KeyEvent keyEvent) {
        char c;
        int i2;
        boolean b = mo4879b();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.f9304b.size();
            for (int i3 = 0; i3 < size; i3++) {
                C0153fp fpVar = (C0153fp) this.f9304b.get(i3);
                if (fpVar.hasSubMenu()) {
                    fpVar.f9334j.m7315a(list, i, keyEvent);
                }
                if (!b) {
                    c = fpVar.f9329e;
                } else {
                    c = fpVar.f9331g;
                }
                if (!b) {
                    i2 = fpVar.f9330f;
                } else {
                    i2 = fpVar.f9332h;
                }
                if ((modifiers & 69647) == (i2 & 69647) && c != 0 && ((c == keyData.meta[0] || c == keyData.meta[2] || (b && c == 8 && i == 67)) && fpVar.isEnabled())) {
                    list.add(fpVar);
                }
            }
        }
    }

    /* renamed from: g */
    public final void mo4889g() {
        ArrayList f = mo4887f();
        if (this.f9315n) {
            Iterator it = this.f9308f.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C0159fv fvVar = (C0159fv) weakReference.get();
                if (fvVar == null) {
                    this.f9308f.remove(weakReference);
                } else {
                    z |= fvVar.mo4830a();
                }
            }
            if (!z) {
                this.f9306d.clear();
                this.f9314m.clear();
                this.f9314m.addAll(mo4887f());
            } else {
                this.f9306d.clear();
                this.f9314m.clear();
                int size = f.size();
                for (int i = 0; i < size; i++) {
                    C0153fp fpVar = (C0153fp) f.get(i);
                    if (fpVar.mo4918e()) {
                        this.f9306d.add(fpVar);
                    } else {
                        this.f9314m.add(fpVar);
                    }
                }
            }
            this.f9315n = false;
        }
    }

    public final MenuItem getItem(int i) {
        return (MenuItem) this.f9304b.get(i);
    }

    /* renamed from: h */
    public final ArrayList mo4891h() {
        mo4889g();
        return this.f9314m;
    }

    /* renamed from: f */
    public final ArrayList mo4887f() {
        if (this.f9305c) {
            this.f9313l.clear();
            int size = this.f9304b.size();
            for (int i = 0; i < size; i++) {
                C0153fp fpVar = (C0153fp) this.f9304b.get(i);
                if (fpVar.isVisible()) {
                    this.f9313l.add(fpVar);
                }
            }
            this.f9305c = false;
            this.f9315n = true;
        }
        return this.f9313l;
    }

    public final boolean hasVisibleItems() {
        int size = size();
        for (int i = 0; i < size; i++) {
            if (((C0153fp) this.f9304b.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return m7313a(i, keyEvent) != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo4895j() {
        this.f9315n = true;
        mo4878b(true);
    }

    /* renamed from: b */
    public final void mo4878b(boolean z) {
        if (this.f9316o) {
            this.f9317p = true;
            if (z) {
                this.f9318q = true;
                return;
            }
            return;
        }
        if (z) {
            this.f9305c = true;
            this.f9315n = true;
        }
        if (!this.f9308f.isEmpty()) {
            mo4885d();
            Iterator it = this.f9308f.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C0159fv fvVar = (C0159fv) weakReference.get();
                if (fvVar == null) {
                    this.f9308f.remove(weakReference);
                } else {
                    fvVar.mo4833b();
                }
            }
            mo4886e();
        }
    }

    public final boolean performIdentifierAction(int i, int i2) {
        return mo4865a(findItem(i), i2);
    }

    /* renamed from: a */
    public final boolean mo4865a(MenuItem menuItem, int i) {
        return mo4866a(menuItem, (C0159fv) null, i);
    }

    /* renamed from: a */
    public final boolean mo4866a(MenuItem menuItem, C0159fv fvVar, int i) {
        boolean z;
        C0153fp fpVar = (C0153fp) menuItem;
        if (fpVar == null || !fpVar.isEnabled()) {
            return false;
        }
        boolean a = fpVar.mo4910a();
        if (fpVar.f9339o == null) {
            if (fpVar.mo4941h()) {
                a |= fpVar.expandActionView();
                if (a) {
                    mo4863a(true);
                    return true;
                }
            } else if (fpVar.hasSubMenu()) {
                if ((i & 4) == 0) {
                    mo4863a(false);
                }
                if (!fpVar.hasSubMenu()) {
                    fpVar.mo4908a(new C0167gc(this.f9303a, this, fpVar));
                }
                C0167gc gcVar = fpVar.f9334j;
                if (this.f9308f.isEmpty()) {
                    z = false;
                } else {
                    z = fvVar != null ? fvVar.mo4832a(gcVar) : false;
                    Iterator it = this.f9308f.iterator();
                    while (it.hasNext()) {
                        WeakReference weakReference = (WeakReference) it.next();
                        C0159fv fvVar2 = (C0159fv) weakReference.get();
                        if (fvVar2 == null) {
                            this.f9308f.remove(weakReference);
                        } else if (!z) {
                            z = fvVar2.mo4832a(gcVar);
                        }
                    }
                }
                a |= z;
                if (!a) {
                    mo4863a(true);
                    return false;
                }
            } else if ((i & 1) == 0) {
                mo4863a(true);
                return a;
            }
            return a;
        }
        throw null;
    }

    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        boolean z;
        C0153fp a = m7313a(i, keyEvent);
        if (a != null) {
            z = mo4865a(a, i2);
        } else {
            z = false;
        }
        if ((i2 & 2) != 0) {
            mo4863a(true);
        }
        return z;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: fo.a(int, boolean):void
     arg types: [int, int]
     candidates:
      fo.a(int, android.view.KeyEvent):fp
      fo.a(fv, android.content.Context):void
      fo.a(android.view.MenuItem, int):boolean
      fo.a(fo, android.view.MenuItem):boolean
      fo.a(int, boolean):void */
    public final void removeGroup(int i) {
        int size = size();
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                if (((C0153fp) this.f9304b.get(i2)).f9326b == i) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        if (i2 >= 0) {
            int size2 = this.f9304b.size() - i2;
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (i3 >= size2 || ((C0153fp) this.f9304b.get(i2)).f9326b != i) {
                    mo4878b(true);
                } else {
                    m7314a(i2, false);
                    i3 = i4;
                }
            }
            mo4878b(true);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: fo.a(int, boolean):void
     arg types: [int, int]
     candidates:
      fo.a(int, android.view.KeyEvent):fp
      fo.a(fv, android.content.Context):void
      fo.a(android.view.MenuItem, int):boolean
      fo.a(fo, android.view.MenuItem):boolean
      fo.a(int, boolean):void */
    public final void removeItem(int i) {
        int size = size();
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                if (((C0153fp) this.f9304b.get(i2)).f9325a == i) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        m7314a(i2, true);
    }

    /* renamed from: a */
    private final void m7314a(int i, boolean z) {
        if (i >= 0 && i < this.f9304b.size()) {
            this.f9304b.remove(i);
            if (z) {
                mo4878b(true);
            }
        }
    }

    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.f9304b.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0153fp fpVar = (C0153fp) this.f9304b.get(i2);
            if (fpVar.f9326b == i) {
                fpVar.mo4909a(z2);
                fpVar.setCheckable(z);
            }
        }
    }

    public void setGroupDividerEnabled(boolean z) {
        this.f9321t = z;
    }

    public final void setGroupEnabled(int i, boolean z) {
        int size = this.f9304b.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0153fp fpVar = (C0153fp) this.f9304b.get(i2);
            if (fpVar.f9326b == i) {
                fpVar.setEnabled(z);
            }
        }
    }

    public final void setGroupVisible(int i, boolean z) {
        int size = this.f9304b.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C0153fp fpVar = (C0153fp) this.f9304b.get(i2);
            if (fpVar.f9326b == i && fpVar.mo4912b(z)) {
                z2 = true;
            }
        }
        if (z2) {
            mo4878b(true);
        }
    }

    /* renamed from: a */
    public final void mo4861a(int i, CharSequence charSequence, int i2, View view) {
        Resources resources = this.f9310i;
        if (view != null) {
            this.f9307e = null;
        } else {
            if (i > 0) {
                this.f9307e = resources.getText(i);
            } else if (charSequence != null) {
                this.f9307e = charSequence;
            }
            if (i2 > 0) {
                C0035bg.m3107a(this.f9303a, i2);
            }
        }
        mo4878b(false);
    }

    public void setQwertyMode(boolean z) {
        this.f9311j = z;
        mo4878b(false);
    }

    public final int size() {
        return this.f9304b.size();
    }

    /* renamed from: e */
    public final void mo4886e() {
        this.f9316o = false;
        if (this.f9317p) {
            this.f9317p = false;
            mo4878b(this.f9318q);
        }
    }

    /* renamed from: d */
    public final void mo4885d() {
        if (!this.f9316o) {
            this.f9316o = true;
            this.f9317p = false;
            this.f9318q = false;
        }
    }
}
