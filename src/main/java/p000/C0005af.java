package p000;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: af */
/* compiled from: PG */
public final class C0005af extends C0317lr {

    /* renamed from: b */
    private boolean f223b;

    /* renamed from: c */
    private boolean f224c;

    /* renamed from: d */
    private boolean f225d = true;

    public C0005af() {
        C0035bg bgVar = (C0035bg) C0086dc.m6104a(new C0004ae(this), "callbacks == null");
        new C0045bq();
        new C0380o(this);
    }

    /* renamed from: a */
    private static void m283a(int i) {
        if ((i & -65536) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.f223b);
        printWriter.print(" mResumed=");
        printWriter.print(this.f224c);
        printWriter.print(" mStopped=");
        printWriter.print(this.f225d);
        if (getApplication() != null) {
            if (getApplication() != null) {
                if (this.f9865a == null) {
                    C0316lq lqVar = (C0316lq) getLastNonConfigurationInstance();
                    if (lqVar != null) {
                        this.f9865a = lqVar.f9864a;
                    }
                    if (this.f9865a == null) {
                        this.f9865a = new C0650y();
                    }
                }
                C0014ao aoVar = new C0015ap(this, this.f9865a).f1564a;
                if (aoVar.f1467a.f8361e > 0) {
                    printWriter.print(str2);
                    printWriter.println("Loaders:");
                    str2 + "    ";
                    C0088de deVar = aoVar.f1467a;
                    if (deVar.f8361e > 0) {
                        C0012am amVar = (C0012am) deVar.mo4171b(0);
                        printWriter.print(str2);
                        printWriter.print("  #");
                        printWriter.print(aoVar.f1467a.mo4170a(0));
                        printWriter.print(": ");
                        throw null;
                    }
                }
            } else {
                throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
            }
        }
        throw null;
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        throw null;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        throw null;
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        throw null;
    }

    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return super.onCreatePanelMenu(i, menu);
        }
        super.onCreatePanelMenu(0, menu);
        getMenuInflater();
        throw null;
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        throw null;
    }

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        throw null;
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        super.onDestroy();
        throw null;
    }

    public final void onLowMemory() {
        super.onLowMemory();
        throw null;
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            throw null;
        } else if (i != 6) {
            return false;
        } else {
            throw null;
        }
    }

    public final void onMultiWindowModeChanged(boolean z) {
        throw null;
    }

    /* access modifiers changed from: protected */
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        throw null;
    }

    public final void onPanelClosed(int i, Menu menu) {
        if (i != 0) {
            super.onPanelClosed(i, menu);
            return;
        }
        throw null;
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        super.onPause();
        this.f224c = false;
        throw null;
    }

    public final void onPictureInPictureModeChanged(boolean z) {
        throw null;
    }

    /* access modifiers changed from: protected */
    public final void onPostResume() {
        super.onPostResume();
        throw null;
    }

    public final boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0) {
            return super.onPreparePanel(i, view, menu);
        }
        super.onPreparePanel(0, view, menu);
        throw null;
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        throw null;
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        this.f224c = true;
        throw null;
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        C0245j jVar = C0245j.DESTROYED;
        throw null;
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        this.f225d = false;
        if (!this.f223b) {
            this.f223b = true;
            throw null;
        }
        throw null;
    }

    public final void onStateNotSaved() {
        throw null;
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        super.onStop();
        this.f225d = true;
        throw null;
    }

    public final void startActivityForResult(Intent intent, int i) {
        if (i != -1) {
            m283a(i);
        }
        super.startActivityForResult(intent, i);
    }

    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        if (i != -1) {
            m283a(i);
        }
        super.startActivityForResult(intent, i, bundle);
    }

    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        if (i != -1) {
            m283a(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (i != -1) {
            m283a(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}
