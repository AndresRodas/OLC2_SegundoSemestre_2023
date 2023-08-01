import logo from './logo.svg';
import './App.css';

//theme
import "primereact/resources/themes/lara-light-indigo/theme.css";     
//core
import "primereact/resources/primereact.min.css";                                               
import { InputTextarea } from 'primereact/inputtextarea';
import { Button } from 'primereact/button';

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <InputTextarea autoResize rows={5} cols={30} />
        <Button label="Submit" className='mt-6' />
      </header>
    </div>
  );
}

export default App;
