function solve(input) {
    class Song {

        constructor(type, name, time) {
            this.type = type;
            this.name = name;
            this.time = time;
        }

        sayHello() {
            console.log(`${this.name}`)
        }
    }
    let songs = [];
    let quantity = input.shift();
    let genre = input.pop();

    for (let i = 0; i < quantity; i++) {

        let [type, name, time] = input[i].split('_');

       let song = new Song(type, name, time);
        songs.push(song);
    }
    if (genre === 'all'){
        songs.forEach((el) => el.sayHello())
    }
    else {
        let filtered = songs.filter((el) => el.type === genre)

        filtered.forEach((el) => el.sayHello())
    }
}
solve([3,
    'favourite_DownTown_3:14',
    'favourite_Kiss_4:16',
    'favourite_Smooth Criminal_4:01',
    'favourite']
)
solve([4,
    'favourite_DownTown_3:14',
    'listenLater_Andalouse_3:24',
    'favourite_In To The Night_3:58',
    'favourite_Live It Up_3:48',
    'listenLater']
)
solve([2,
    'like_Replay_3:15',
    'ban_Photoshop_3:48',
    'all']
)