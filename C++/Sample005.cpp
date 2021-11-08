#include <iostream>

using namespace std;

int main() {
    srand((unsigned)time(NULL));

    int money = rand() % 101;
    int love = rand() % 101;
    int health = rand() % 101;
    int total = (money + love + health) / 3;

    cout << "金運: " << money << endl;
    cout << "恋愛運: " << love << endl;
    cout << "健康運: " << health << endl;
    cout << "総合運: " << total << endl;

    return 0;
}
