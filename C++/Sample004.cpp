#include <iostream>

using namespace std;

int main() {

    int seibetu;
    string namae;

    cout << "お名前は？：";
    cin >> namae;

    cout << "性別は：" << endl;
    cout << "1：男性" << endl;;
    cout << "2：女性" << endl;
    cin >> seibetu;

    if( seibetu == 1 ) {
        cout << namae << "くん、こんにちは！" << endl;
    } else if( seibetu == 2 ) {
        cout << namae << "ちゃん、こんにちは！" << endl;
    }

    return 0;
}
